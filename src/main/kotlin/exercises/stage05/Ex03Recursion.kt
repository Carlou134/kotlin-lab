package exercises.stage05

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 5.3 — Recursión
 *  Wiki: 05-funciones/02-recursion.md
 * ============================================================
 *
 *  OBJETIVO
 *    Escribir funciones recursivas con caso base y entender tailrec.
 *
 *  ENUNCIADO
 *    Escribe estas funciones private, todas SIN bucles:
 *
 *      1. cuentaRegresiva(n: Int)
 *         Imprime n, n-1, ..., 0 y después "¡Despegue!".
 *      2. factorial(n: Int): Long
 *         factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
 *      3. sumarDigitos(n: Int): Int
 *         sumarDigitos(2026) = 2 + 0 + 2 + 6 = 10
 *         Pista: n % 10 te da el último dígito y n / 10 te lo quita.
 *      4. sumarHasta(n: Int): Long
 *         1 + 2 + ... + n, recursiva NORMAL.
 *      5. sumarHastaTailrec(n: Int, acumulado: Long = 0): Long
 *         Lo mismo, pero con tailrec.
 *
 *    En recursion(), llama a cada una e imprime el resultado.
 *
 *  SALIDA ESPERADA
 *    3 2 1 0 ¡Despegue!
 *    5! = 120
 *    Suma de dígitos de 2026 = 10
 *    Suma hasta 100 = 5050
 *    Suma hasta 100 (tailrec) = 5050
 *    Suma hasta 100000 (tailrec) = 5000050000
 *
 *  EXPERIMENTO (responde en un comentario)
 *    Llama a sumarHasta(100000), la versión NORMAL. ¿Qué error muestra el menú?
 *    ¿Por qué la versión tailrec no falla?
 *    Después comenta esa llamada para que el ejercicio termine bien.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "5.3",
    title = "Recursión",
    wikiLesson = "05-funciones/02-recursion.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué es el caso base y qué pasa si lo olvidas?
        - ¿Qué es la pila (stack) y por qué se "desborda"?
        - ¿Qué condición tiene que cumplir una función para poder ser tailrec?
    """.trimIndent(),
    solve = ::recursion,
)

fun recursion() {
    TODO("Ejercicio 5.3")
}
