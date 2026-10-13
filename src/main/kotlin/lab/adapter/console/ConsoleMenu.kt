package lab.adapter.console

import lab.domain.Concept
import lab.domain.Exercise
import lab.port.ExerciseCatalog

/**
 * Adaptador de entrada: la "cara" del lab en la terminal.
 *
 * Solo sabe mostrar y leer. No sabe de dónde salen los ejercicios:
 * los pide a través del puerto [ExerciseCatalog]. Por eso en la v2
 * se puede reemplazar por una UI en Compose sin tocar el resto.
 */
class ConsoleMenu(private val catalog: ExerciseCatalog) {

    fun start() {
        val concepts = catalog.concepts()
        while (true) {
            printHeader("KOTLIN LAB")
            for (i in 0 until concepts.size) {
                val concept = concepts[i]
                val explained = countExplained(concept.exercises)
                println("  ${i + 1}. ${concept.title}  ($explained/${concept.exercises.size} explicados)")
            }
            println("  0. Salir")

            val option = readOption(concepts.size)
            if (option == 0) {
                println("\n¡Hasta la próxima!")
                return
            }
            showConcept(concepts[option - 1])
        }
    }

    private fun showConcept(concept: Concept) {
        val exercises = concept.exercises
        while (true) {
            printHeader("${concept.number}. ${concept.title}")
            println("  Wiki: ${concept.wikiFolder}")
            println("  [x] = ya escribiste tu explicación\n")
            for (i in 0 until exercises.size) {
                val exercise = exercises[i]
                val mark = if (exercise.hasExplanation) "[x]" else "[ ]"
                println("  ${i + 1}. $mark ${exercise.id} ${exercise.title}")
            }
            println("  0. Volver")

            val option = readOption(exercises.size)
            if (option == 0) return
            showExercise(exercises[option - 1])
        }
    }

    private fun showExercise(exercise: Exercise) {
        printHeader("${exercise.id} ${exercise.title}")
        println("  Wiki: ${exercise.wikiLesson}\n")
        println("EXPLICACIÓN")
        println(exercise.explanation)

        print("\n¿Ejecutar el ejercicio? (s/n): ")
        val answer = readLine()?.trim()?.lowercase()
        if (answer == "s") runExercise(exercise)

        print("\nPresiona Enter para volver...")
        readLine()
    }

    private fun runExercise(exercise: Exercise) {
        println("\n----- Salida de ${exercise.id} -----")
        try {
            exercise.solve()
        } catch (e: NotImplementedError) {
            println("Pendiente: todavía no resolviste este ejercicio.")
            println("Abre su archivo y reemplaza el TODO() por tu solución.")
        } catch (e: Throwable) {
            // Un ejercicio roto no debe tumbar todo el lab: mostramos el error y seguimos.
            println("El ejercicio terminó con un error: $e")
        }
        println("----- Fin de ${exercise.id} -----")
    }

    // Repite la pregunta hasta recibir un número entre 0 y max.
    // Si la entrada se cierra (null), lo trata como "0" para poder salir.
    private fun readOption(max: Int): Int {
        while (true) {
            print("\nElige una opción (0-$max): ")
            val input = readLine() ?: return 0
            val option = input.trim().toIntOrNull()
            if (option != null && option in 0..max) return option
            println("Opción inválida. Escribe un número entre 0 y $max.")
        }
    }

    private fun countExplained(exercises: List<Exercise>): Int {
        var count = 0
        for (exercise in exercises) {
            if (exercise.hasExplanation) count++
        }
        return count
    }

    private fun printHeader(title: String) {
        println()
        println("=".repeat(50))
        println("  $title")
        println("=".repeat(50))
    }
}
