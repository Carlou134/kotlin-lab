package exercises.stage07

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 7.3 — INTEGRADOR: Mini tienda en consola
 *  Wiki: etapas 01 a 07 completas
 * ============================================================
 *
 *  OBJETIVO
 *    Juntar TODO lo de los fundamentos en un programa real y pequeño.
 *    No hay código guía: el diseño lo decides tú.
 *
 *  ENUNCIADO
 *    Una tienda con este menú:
 *
 *      === MINI TIENDA ===
 *      1. Ver catálogo
 *      2. Agregar al carrito
 *      3. Ver carrito
 *      4. Pagar
 *      0. Salir
 *
 *    1. Ver catálogo: lista los productos con código, nombre, precio y stock.
 *    2. Agregar al carrito: pide el código y la cantidad.
 *         - código inexistente -> mensaje claro, sin explotar
 *         - cantidad inválida o mayor al stock -> mensaje claro, sin explotar
 *         - si ya estaba en el carrito, suma la cantidad
 *    3. Ver carrito: cada línea con su subtotal, después subtotal general,
 *       impuesto (18%), descuento (las reglas del 4.1) y total.
 *    4. Pagar: descuenta el stock, vacía el carrito y cambia el estado del pedido.
 *       Si el carrito está vacío, no deja pagar.
 *    0. Salir: si quedó algo en el carrito sin pagar, pregunta "¿Seguro? (s/n)".
 *
 *  REQUISITOS (marca cada uno con [x] cuando lo cumplas)
 *    [ ] 02 - val por defecto; var solo donde haga falta
 *    [ ] 03 - el catálogo es un Map<Int, Producto> (código -> producto)
 *    [ ] 03 - el carrito es un MutableMap<Int, Int> (código -> cantidad)
 *    [ ] 04 - el menú es un bucle con when
 *    [ ] 05 - cada opción del menú es una función private
 *    [ ] 05 - los cálculos (subtotal, impuesto, descuento) son funciones que DEVUELVEN valores
 *    [ ] 06 - Producto es una data class
 *    [ ] 06 - el estado del pedido es un enum (ABIERTO, PAGADO)
 *    [ ] 07 - ningún !! en todo el archivo
 *    [ ] 07 - sin stock suficiente se lanza tu propia excepción, y se atrapa en el menú
 *
 *  CATÁLOGO INICIAL (sugerido)
 *    101 Arroz    4.5    30
 *    102 Aceite  18.5    12
 *    103 Café   119.5     5
 *    104 Azúcar   3.8     0
 *
 *  REGLAS
 *    - Todo lo que declares en este archivo, márcalo private.
 *    - Pruébalo intentando ROMPERLO: letras donde van números, códigos que no existen,
 *      cantidades negativas, pagar con el carrito vacío...
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "7.3",
    title = "INTEGRADOR: Mini tienda en consola",
    wikiLesson = "01 a 07",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Cómo dividiste el programa en funciones y por qué así?
        - ¿Qué casos de error encontraste al intentar romperlo y cómo los manejaste?
        - Si mañana el catálogo viniera de un archivo, ¿qué partes tendrías que cambiar?
    """.trimIndent(),
    solve = ::miniTienda,
)

fun miniTienda() {
    TODO("Ejercicio 7.3")
}
