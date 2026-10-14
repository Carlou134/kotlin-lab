package exercises.stage01

import lab.domain.Exercise
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/*
 * ============================================================
 *  EJERCICIO 1.1 — Cabecera de un ticket
 *  Wiki: 01-fundamentos/01-introduccion.md
 * ============================================================
 *
 *  OBJETIVO
 *    Usar println(), print() y comentarios.
 *
 *  ENUNCIADO
 *    Dentro de primerPrograma(), imprime la cabecera del ticket de una tienda.
 *
 *  SALIDA ESPERADA
 *    ==============================
 *         TIENDA DON PEPE
 *    ==============================
 *    Fecha: 13/10/2026
 *    Cajero: Ana
 *    ¡Gracias por su compra!
 *
 *  REGLAS
 *    - Las líneas "Fecha:" y "Cajero:" se arman con un print() seguido de un println().
 *      Ejemplo: print("Fecha: ") y después println("13/10/2026").
 *    - Escribe un comentario de una línea (//) y uno de varias líneas.
 *    - Todavía no uses variables (las ves en la etapa 02).
 *
 *  PREGUNTA (responde aquí abajo, en un comentario)
 *    ¿Qué pasa si cambias el último println() por print() y ejecutas
 *    el ejercicio desde el menú? ¿Dónde aparece el siguiente texto?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "1.1",
    title = "Cabecera de un ticket",
    wikiLesson = "01-fundamentos/01-introduccion.md",
    explanation = """
        - ¿Qué es fun main() y por qué todo programa necesita uno?
        fun main() es el punto de entrada del programa: la primera función que la JVM ejecuta.
        No es donde se compila: el compilador traduce todo el archivo .kt a bytecode antes de
        que el programa arranque. Sin main(), la JVM no sabría por dónde empezar.
        
        - ¿Qué diferencia hay entre print() y println()?
        print() se encarga de imprimir en la misma linea en consola. println() imprime en consola y 
        termina con un salto de linea.
        
        - ¿Para qué sirven los comentarios si el programa los ignora?
        Los comentarios sirven para explicar ciertos fragmentos del codigo a otras personas
        (o a mí en el futuro), y para desactivar código sin borrarlo.
        
        - ¿Qué pasa si cambias el último println() por print() y ejecutas
        el ejercicio desde el menú? ¿Dónde aparece el siguiente texto?
        Si hago el cambio, cada nuevo texto que quiera añadir se imprimira en la misma linea que el ultimo print.
        Por ende, el siguiente texto aparecera al costado de la última línea que escribí.
      
    """.trimIndent(),
    solve = ::primerPrograma,
)

fun primerPrograma() {
    println("==============================")
    println("\tTIENDA DON PEPE")
    println("==============================")
    print("Fecha: ${LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}\nCajero: Ana\n")
    println("¡Gracias por su compra!")
}
