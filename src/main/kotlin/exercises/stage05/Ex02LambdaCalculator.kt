package exercises.stage05

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 5.2 — Calculadora con lambdas
 *  Wiki: 05-funciones/01-funciones.md (sección de lambdas)
 * ============================================================
 *
 *  OBJETIVO
 *    Guardar funciones en variables (lambdas) y elegirlas en tiempo de ejecución.
 *
 *  ENUNCIADO
 *    1. Dentro de calculadoraConLambdas(), crea cuatro lambdas que reciban dos Double:
 *       sumar, restar, multiplicar y dividir.
 *    2. Crea una quinta, potencia, declarando su tipo completo a mano:
 *         val potencia: (Double, Double) -> Double = ...
 *       Usa Math.pow.
 *    3. Guarda las cinco en un map símbolo -> lambda:
 *         "+", "-", "*", "/", "^"
 *    4. Pide al usuario el primer número, el símbolo y el segundo número.
 *       Busca la lambda en el map:
 *         - si no existe (es null), imprime "Operación no soportada: X"
 *         - si existe, llámala e imprime el resultado
 *    5. Si el símbolo es "/" y el segundo número es 0, imprime "No se puede dividir por 0"
 *       en vez de calcular.
 *
 *    Para leer un número usa:
 *      (readLine() ?: "").toDoubleOrNull() ?: 0.0
 *
 *  SALIDA ESPERADA (ejemplos)
 *    Primer número: 2
 *    Operación (+ - * / ^): ^
 *    Segundo número: 10
 *    2.0 ^ 10.0 = 1024.0
 *
 *    Operación (+ - * / ^): %
 *    Operación no soportada: %
 *
 *  RETO EXTRA (opcional)
 *    Escribe una función private que RECIBA una lambda como parámetro:
 *      private fun calcular(a: Double, b: Double, operacion: (Double, Double) -> Double): Double
 *    y úsala en el paso 4.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex02 = Exercise(
    id = "5.2",
    title = "Calculadora con lambdas",
    wikiLesson = "05-funciones/01-funciones.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué es una lambda? ¿En qué se parece y en qué se diferencia de una fun?
        - ¿Qué significa el tipo (Double, Double) -> Double?
        - ¿Qué ventaja tiene guardar las operaciones en un map en vez de un when gigante?
    """.trimIndent(),
    solve = ::calculadoraConLambdas,
)

fun calculadoraConLambdas() {
    TODO("Ejercicio 5.2")
}
