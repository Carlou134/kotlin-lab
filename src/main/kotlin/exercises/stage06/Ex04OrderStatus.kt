package exercises.stage06

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 6.4 — Estados de un pedido
 *  Wiki: 06-poo/04-enums.md
 * ============================================================
 *
 *  OBJETIVO
 *    Modelar un conjunto fijo de opciones con enum, usarlo con when,
 *    darle propiedades y convertir números en opciones.
 *
 *  ENUNCIADO
 *    1. Declara:
 *         private enum class EstadoPedido(val descripcion: String, val esFinal: Boolean)
 *       con PENDIENTE, PAGADO, ENVIADO, ENTREGADO y CANCELADO.
 *       Solo ENTREGADO y CANCELADO son finales.
 *    2. Escribe private fun siguiente(estado: EstadoPedido): EstadoPedido con un when SIN else:
 *         PENDIENTE -> PAGADO -> ENVIADO -> ENTREGADO
 *         Los estados finales se devuelven a sí mismos.
 *    3. En estadosDePedido():
 *         a) imprime todos los estados numerados, usando entries
 *         b) empieza en PENDIENTE y avanza con siguiente() hasta llegar a un estado final,
 *            imprimiendo cada paso
 *         c) pide un número al usuario y conviértelo en estado. Si está fuera de rango,
 *            imprime "Estado inexistente".
 *
 *  SALIDA ESPERADA (aproximada)
 *    0. PENDIENTE - Esperando el pago
 *    1. PAGADO - Pago confirmado
 *    2. ENVIADO - En camino
 *    3. ENTREGADO - Entregado al cliente
 *    4. CANCELADO - Pedido cancelado
 *    PENDIENTE -> PAGADO -> ENVIADO -> ENTREGADO
 *    Número de estado: 2
 *    Elegiste: ENVIADO (En camino)
 *
 *  EXPERIMENTO (responde en un comentario)
 *    Agrega un estado nuevo DEVUELTO al enum, sin tocar siguiente(). ¿Qué pasa al compilar?
 *    ¿Por qué eso es una VENTAJA de no poner else en el when?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex04 = Exercise(
    id = "6.4",
    title = "Estados de un pedido",
    wikiLesson = "06-poo/04-enums.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué problema resuelve un enum frente a usar Strings como "pagado"?
        - ¿Qué significa que un when sea exhaustivo?
        - ¿Para qué le pones propiedades a un enum?
    """.trimIndent(),
    solve = ::estadosDePedido,
)

fun estadosDePedido() {
    TODO("Ejercicio 6.4")
}
