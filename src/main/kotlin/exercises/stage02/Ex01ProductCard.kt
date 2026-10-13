package exercises.stage02

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 2.1 — Ficha de producto
 *  Wiki: 02-tipos-y-variables/01-tipos-y-variables.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar val y var, los tipos básicos, la inferencia y las conversiones.
 *
 *  ENUNCIADO
 *    1. Declara los datos de un producto:
 *       - nombre: "Teclado mecánico"         -> no cambia nunca
 *       - codigo: 1002003004                  -> no cambia; declara el tipo Long a mano
 *       - precio: 189.9                       -> puede cambiar
 *       - stock: 15                           -> puede cambiar
 *       - activo: true                        -> no cambia; declara el tipo Boolean a mano
 *    2. Imprime la ficha.
 *    3. Aplica una oferta (el precio pasa a 149.9) y registra una venta (el stock baja en 1).
 *       Vuelve a imprimir precio y stock.
 *    4. Conversiones:
 *       - val precioTexto = "49.90"  -> conviértelo a Double
 *       - val cantidadTexto = "3"    -> conviértelo a Int
 *       - multiplica los dos e imprime el resultado
 *       - convierte el precio 149.9 a Int e imprímelo
 *
 *  SALIDA ESPERADA
 *    Producto: Teclado mecánico
 *    Código: 1002003004
 *    Precio: 189.9
 *    Stock: 15
 *    Activo: true
 *    --- Después de la oferta y una venta ---
 *    Precio: 149.9
 *    Stock: 14
 *    --- Conversiones ---
 *    "49.90" como Double: 49.9
 *    "3" como Int: 3
 *    49.9 x 3 = 149.70000000000002
 *    149.9 como Int: 149
 *
 *  REGLAS
 *    - Intenta reasignar "nombre" (nombre = "otro"). Lee el error del compilador,
 *      cópialo en un comentario y después comenta esa línea para que compile.
 *
 *  PREGUNTAS (responde en comentarios)
 *    a) ¿Por qué 49.9 x 3 no da exactamente 149.7?
 *    b) ¿Por qué 149.9 como Int da 149 y no 150?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "2.1",
    title = "Ficha de producto",
    wikiLesson = "02-tipos-y-variables/01-tipos-y-variables.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre val y var? ¿Cuál usas por defecto y por qué?
        - ¿Qué es la inferencia de tipos? ¿Cuándo conviene declarar el tipo a mano?
        - ¿Por qué Kotlin no convierte solo un String a número?
    """.trimIndent(),
    solve = ::fichaDeProducto,
)

fun fichaDeProducto() {
    TODO("Ejercicio 2.1")
}
