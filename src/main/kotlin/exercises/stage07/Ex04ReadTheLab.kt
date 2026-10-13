package exercises.stage07

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 7.4 — Lee el código del lab
 *  Wiki: etapas 01 a 07 completas
 * ============================================================
 *
 *  OBJETIVO
 *    Leer código ajeno y entenderlo, que es la mitad del trabajo real.
 *    El menú que vienes usando está escrito casi todo con lo que viste en 01-07.
 *    Lo poco que es nuevo está señalado en las preguntas.
 *
 *  ENUNCIADO
 *    Abre y lee estos archivos, en este orden:
 *      - src/main/kotlin/main.kt
 *      - lab/domain/Exercise.kt y lab/domain/Concept.kt
 *      - lab/port/ExerciseCatalog.kt
 *      - lab/adapter/catalog/InMemoryExerciseCatalog.kt
 *      - lab/adapter/console/ConsoleMenu.kt
 *
 *    Responde en comentarios, aquí abajo:
 *      a) En Exercise, hasExplanation no guarda nada: ¿qué tipo de propiedad es?
 *      b) solve tiene el tipo () -> Unit. ¿Qué significa? ¿Qué lección lo explica?
 *      c) En cada ejercicio aparece solve = ::fichaDeProducto. Los :: son NUEVOS:
 *         se llaman "referencia a función" y pasan la función SIN ejecutarla.
 *         ¿Qué pasaría si escribieras solve = fichaDeProducto() con paréntesis?
 *      d) En readOption(), ¿por qué hay un while (true)? ¿Cómo se sale de él?
 *      e) En runExercise(), ¿por qué el catch de NotImplementedError va ANTES que el de Throwable?
 *      f) ¿Qué hace "?: return 0" en readOption()?
 *      g) ConsoleMenu recibe un ExerciseCatalog (interface), no un InMemoryExerciseCatalog.
 *         La "interface" es NUEVA: llega en la etapa 08. Por ahora, intuye:
 *         ¿qué ganas al no atar el menú a una clase concreta?
 *
 *  RETO EXTRA (opcional)
 *    Agrega al menú principal una opción "9. Ejercicio al azar" que elija un
 *    ejercicio cualquiera de cualquier concepto y lo muestre con showExercise().
 *
 *  CUANDO TERMINES
 *    Reemplaza el TODO() por un println() con una frase sobre lo que aprendiste,
 *    y escribe la explicación de abajo.
 */

val ex04 = Exercise(
    id = "7.4",
    title = "Lee el código del lab",
    wikiLesson = "01 a 07",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - Explica el recorrido completo: desde que eliges una opción en el menú
          hasta que se ejecuta tu función del ejercicio.
        - ¿Por qué el menú está separado de los ejercicios? ¿Qué permitirá en la v2?
    """.trimIndent(),
    solve = ::leerElLab,
)

fun leerElLab() {
    TODO("Ejercicio 7.4")
}
