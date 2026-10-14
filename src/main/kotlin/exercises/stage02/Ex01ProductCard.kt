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
        - ¿Qué diferencia hay entre val y var? ¿Cuál usas por defecto y por qué?
        val es para definir variables inmutables. var es para variables que se puede cambiar.
        Por defecto usamos val: si un valor no puede cambiar, no tengo que seguirle el rastro por el código,
        y si intento cambiarlo por error el compilador me avisa. Menos cosas que cambian, menos bugs.
        Uso var solo cuando el valor realmente necesita cambiar (como precio y stock).
        
        - ¿Qué es la inferencia de tipos? ¿Cuándo conviene declarar el tipo a mano?
        Inferencia por tipos se refiere a que el compiladr sabe que tipo de dato es solo con el valor.
        Conviene declarar el tipo cuando aun no le asignas valor, o cuando el tipo que infiere el compilador
        no es el que quiero. Ejemplo: 1002003004 entra en un Int, así que sin ": Long" lo infiere como Int.

        - ¿Por qué Kotlin no convierte solo un String a número?
        Porque no todo String es un número: "hola" no se puede convertir. Kotlin me obliga a convertir
        de forma explícita (toInt(), toDouble()) para que yo decida qué pasa si la conversión falla.

        - ¿Por qué 49.9 x 3 no da exactamente 149.7?
        Porque un Double guarda los números en binario, y 49.9 no tiene representación exacta en binario
        (como 1/3 = 0.333... en decimal). Ese pequeño error se arrastra al multiplicar.
        
        - ¿Por qué 149.9 como Int da 149 y no 150?
        Porque hace un casteo no un redondeo. 
        
        - Al intenar re-asignar la variable nombre con otro valor nos da el siguiente error: 
            Ex01ProductCard.kt:103:5 'val' cannot be reassigned.

        
    """.trimIndent(),
    solve = ::fichaDeProducto,
)

fun fichaDeProducto() {
    val nombre = "Teclado mecánico"
    val codigo: Long = 1002003004
    var precio = 189.9
    var stock = 15
    val activo: Boolean = true

    println("Producto: $nombre\nCódigo: $codigo\nPrecio: $precio\nStock: $stock\nActivo: $activo")

    precio = 149.9
    stock -= 1
    println("--- Después de la oferta y una venta ---\nPrecio: $precio\nStock: $stock")

    val precioTexto = "49.90"
    val precioConvertivo = precioTexto.toDouble()

    val cantidadTexto = "3"
    val cantidadConvertida = cantidadTexto.toInt()

    println("--- Conversiones ---\n\"49.90\" como Double: ${precioConvertivo}\n\"3\" como Int: ${cantidadConvertida}")
    println("49.9 x 3 = ${precioConvertivo * cantidadConvertida}")
    println("149.9 como Int: ${precio.toInt()}")
}
