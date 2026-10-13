package exercises.stage07

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 7.2 — Excepciones del almacén
 *  Wiki: 07-null-safety-y-errores/02-excepciones.md
 * ============================================================
 *
 *  OBJETIVO
 *    Lanzar y atrapar excepciones: try/catch/finally, try como expresión,
 *    throw y excepciones propias.
 *
 *  ENUNCIADO
 *    1. Declara tu propia excepción:
 *         private class StockInsuficienteException(producto: String, pedido: Int, disponible: Int)
 *       Que herede de Exception con el mensaje:
 *         "Stock insuficiente de <producto>: pediste <pedido>, hay <disponible>"
 *    2. Escribe private fun retirar(producto: String, disponible: Int, cantidad: Int): Int
 *         - cantidad 0 o menos -> throw IllegalArgumentException("La cantidad debe ser positiva")
 *         - cantidad mayor a disponible -> throw StockInsuficienteException(...)
 *         - si todo está bien -> devuelve el stock restante
 *    3. En excepcionesDelAlmacen(), llama a retirar() con estos tres casos, cada uno en su try:
 *         a) "arroz", 30, 5
 *         b) "aceite", 3, 10
 *         c) "café", 5, -1
 *       Usa un catch DISTINTO para cada tipo de excepción y un finally que imprima
 *       "Operación registrada".
 *    4. try como expresión: convierte el texto "12x" a Int con toInt() y, si falla,
 *       que el valor sea 0:
 *         val cantidad = try { ... } catch (e: NumberFormatException) { ... }
 *
 *  SALIDA ESPERADA
 *    Quedan 25 de arroz
 *    Operación registrada
 *    Error de stock: Stock insuficiente de aceite: pediste 10, hay 3
 *    Operación registrada
 *    Dato inválido: La cantidad debe ser positiva
 *    Operación registrada
 *    "12x" convertido: 0
 *
 *  PREGUNTA (responde en un comentario)
 *    ¿Qué pasa si en el caso b) NO lo atrapas? Pruébalo: el menú te va a mostrar el error.
 *    ¿Por qué el menú del lab no se cae aunque tu ejercicio sí lo haga?
 *    (Pista: busca runExercise en lab/adapter/console/ConsoleMenu.kt)
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex02 = Exercise(
    id = "7.2",
    title = "Excepciones del almacén",
    wikiLesson = "07-null-safety-y-errores/02-excepciones.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué hace cada parte: try, catch y finally?
        - ¿Cuándo devolver null y cuándo lanzar una excepción?
        - ¿Qué ganas creando tu propia excepción en vez de usar Exception a secas?
    """.trimIndent(),
    solve = ::excepcionesDelAlmacen,
)

fun excepcionesDelAlmacen() {
    TODO("Ejercicio 7.2")
}
