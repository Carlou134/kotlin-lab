package exercises.stage06

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 6.1 — La clase Producto
 *  Wiki: 06-poo/01-clases.md
 * ============================================================
 *
 *  OBJETIVO
 *    Crear una clase con constructor primario, bloque init y funciones miembro.
 *
 *  ENUNCIADO
 *    1. Debajo de claseProducto(), declara:
 *         private class Producto(val nombre: String, var precio: Double, var stock: Int)
 *    2. En un bloque init:
 *         - imprime "Producto creado: <nombre>"
 *         - si el precio es 0 o menos, imprime "ADVERTENCIA: <nombre> tiene precio inválido"
 *           (en la etapa 07 esto se convierte en una excepción)
 *    3. Agrega estas funciones miembro:
 *         - vender(cantidad: Int): si no alcanza el stock, imprime
 *           "Stock insuficiente de <nombre>: pediste X, hay Y". Si alcanza, descuenta.
 *         - reponer(cantidad: Int): suma al stock.
 *         - describir(): String -> "Teclado | S/ 189.9 | stock 15"
 *    4. En claseProducto():
 *         - crea dos productos (uno con precio 0 para ver la advertencia)
 *         - vende, repone e imprime describir() después de cada paso
 *         - demuestra que modificar uno NO afecta al otro
 *
 *  SALIDA ESPERADA (aproximada)
 *    Producto creado: Teclado
 *    Producto creado: Mouse
 *    ADVERTENCIA: Mouse tiene precio inválido
 *    Teclado | S/ 189.9 | stock 15
 *    Teclado | S/ 189.9 | stock 12
 *    Stock insuficiente de Teclado: pediste 20, hay 12
 *    Teclado | S/ 189.9 | stock 22
 *    Mouse | S/ 0.0 | stock 8
 *
 *  REGLAS
 *    - La clase va como private para que no choque con otras clases Producto del paquete.
 *
 *  PREGUNTA (responde en un comentario)
 *    ¿Puedes hacer teclado.nombre = "otro"? ¿Y teclado.precio = 99.0? ¿Por qué?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "6.1",
    title = "La clase Producto",
    wikiLesson = "06-poo/01-clases.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre una clase y una instancia (objeto)?
        - ¿Cuándo se ejecuta el bloque init?
        - ¿Por qué vender() es una función de la clase y no una función suelta?
    """.trimIndent(),
    solve = ::claseProducto,
)

fun claseProducto() {
    TODO("Ejercicio 6.1")
}
