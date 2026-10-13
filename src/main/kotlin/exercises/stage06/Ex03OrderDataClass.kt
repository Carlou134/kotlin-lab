package exercises.stage06

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 6.3 — Pedidos: clase normal vs data class
 *  Wiki: 06-poo/03-data-classes.md
 * ============================================================
 *
 *  OBJETIVO
 *    Ver con tus propios ojos qué te regala una data class.
 *
 *  ENUNCIADO
 *    1. Declara dos clases private con los MISMOS datos:
 *         private class PedidoNormal(val id: Int, val cliente: String, val total: Double)
 *         private data class Pedido(val id: Int, val cliente: String, val total: Double)
 *    2. Crea dos PedidoNormal con los mismos datos (1, "Ana", 250.0) y dos Pedido iguales.
 *    3. Compara lado a lado:
 *         a) println() de cada uno               -> toString
 *         b) a == b                              -> igualdad
 *         c) a.hashCode() y b.hashCode()
 *         d) meter los dos en un setOf(...) e imprimir el tamaño
 *    4. Con copy(), crea un pedido igual al original pero con total 300.0.
 *       Imprime los dos para ver que el original NO cambió.
 *    5. Desestructura un Pedido: val (id, cliente, total) = pedido
 *
 *  SALIDA ESPERADA (aproximada)
 *    Normal:  exercises.stage06.PedidoNormal@1b6d3586
 *    Data:    Pedido(id=1, cliente=Ana, total=250.0)
 *    Normal ==: false
 *    Data ==:   true
 *    Set de normales: 2 elementos
 *    Set de data:     1 elemento
 *    Original: Pedido(id=1, cliente=Ana, total=250.0)
 *    Copia:    Pedido(id=1, cliente=Ana, total=300.0)
 *    Pedido 1 de Ana por 250.0
 *
 *  PREGUNTA (responde en un comentario)
 *    ¿Por qué el set de PedidoNormal tiene 2 elementos si los datos son iguales?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "6.3",
    title = "Pedidos: clase normal vs data class",
    wikiLesson = "06-poo/03-data-classes.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué genera automáticamente una data class?
        - ¿Qué diferencia hay entre "son el mismo objeto" y "tienen los mismos datos"?
        - ¿Por qué copy() es mejor que tener propiedades var?
        - ¿Cuándo NO usarías una data class?
    """.trimIndent(),
    solve = ::pedidosDataClass,
)

fun pedidosDataClass() {
    TODO("Ejercicio 6.3")
}
