package exercises.stage01

import lab.domain.Exercise

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
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué es fun main() y por qué todo programa necesita uno?
        - ¿Qué diferencia hay entre print() y println()?
        - ¿Para qué sirven los comentarios si el programa los ignora?
    """.trimIndent(),
    solve = ::primerPrograma,
)

fun primerPrograma() {
    TODO("Ejercicio 1.1")
}
