package exercises.stage04

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 4.4 — Adivina el número
 *  Wiki: 04-control-de-flujo/02-bucles.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar while y do..while con datos que escribe el usuario.
 *
 *  ENUNCIADO
 *    1. El programa elige un número secreto entre 1 y 50:
 *         val secreto = (1..50).random()
 *    2. El usuario tiene 5 intentos. Después de cada intento dile
 *       "Más alto", "Más bajo" o "¡Correcto!".
 *    3. Si se le acaban los intentos, muestra cuál era el número.
 *    4. Al terminar, pregunta "¿Jugar otra vez? (s/n)". Si responde "s", empieza otra partida.
 *
 *    Para leer un número usa esta línea tal cual:
 *      val intento = (readLine() ?: "").toIntOrNull() ?: -1
 *    Si el usuario escribe algo que no es un número, queda -1. Avísale y
 *    NO le descuentes el intento. Esa línea la entiendes a fondo en la etapa 07.
 *
 *  SALIDA ESPERADA (ejemplo)
 *    Adivina el número (1-50). Tienes 5 intentos.
 *    Intento 1: 25
 *    Más alto
 *    Intento 2: hola
 *    Eso no es un número. No cuenta como intento.
 *    Intento 2: 40
 *    Más bajo
 *    Intento 3: 33
 *    ¡Correcto! Lo lograste en 3 intentos.
 *    ¿Jugar otra vez? (s/n): n
 *    ¡Gracias por jugar!
 *
 *  REGLAS
 *    - Los intentos de UNA partida van en un while.
 *    - Las partidas van en un do..while: siempre se juega al menos una.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex04 = Exercise(
    id = "4.4",
    title = "Adivina el número",
    wikiLesson = "04-control-de-flujo/02-bucles.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre while y do..while?
        - ¿Por qué aquí usas while y no for?
        - ¿Qué riesgo tiene un while si la condición nunca se vuelve false?
    """.trimIndent(),
    solve = ::adivinaElNumero,
)

fun adivinaElNumero() {
    TODO("Ejercicio 4.4")
}
