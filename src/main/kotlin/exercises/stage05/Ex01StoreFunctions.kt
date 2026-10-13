package exercises.stage05

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 5.1 — Funciones de la tienda
 *  Wiki: 05-funciones/01-funciones.md
 * ============================================================
 *
 *  OBJETIVO
 *    Declarar funciones con parámetros y return, argumentos con nombre y
 *    por defecto, funciones de una sola expresión y alcance (scope).
 *
 *  ENUNCIADO
 *    Escribe estas funciones DEBAJO de funcionesDeTienda(), todas como private:
 *
 *      1. subtotal(precio: Double, cantidad: Int): Double
 *         Con cuerpo { } y return.
 *      2. aplicarDescuento(monto: Double, porcentaje: Double = 0.0): Double
 *         El porcentaje es opcional: si no lo pasas, no hay descuento.
 *      3. esEnvioGratis(total: Double): Boolean
 *         De UNA sola expresión (con =). Es gratis desde 200.0.
 *      4. lineaDeTicket(producto: String, total: Double, moneda: String = "S/"): String
 *         Devuelve el texto, no lo imprime. Ejemplo: "Café ........ S/ 119.5"
 *
 *    Después, dentro de funcionesDeTienda(), úsalas:
 *      - subtotal de 3 cafés a 119.5
 *      - ese subtotal con 10% de descuento, pasando los argumentos CON NOMBRE
 *        y en orden invertido (porcentaje primero)
 *      - ¿el envío es gratis?
 *      - imprime la línea del ticket una vez con la moneda por defecto y otra con "USD"
 *
 *  SALIDA ESPERADA
 *    Subtotal: 358.5
 *    Con descuento: 322.65
 *    ¿Envío gratis? true
 *    Café ........ S/ 322.65
 *    Café ........ USD 322.65
 *
 *  REGLAS
 *    - Declara todas tus funciones auxiliares como private. Si no lo haces, pueden
 *      chocar con las de otros ejercicios del mismo paquete.
 *    - Alcance: declara una variable dentro de subtotal() e intenta usarla desde
 *      funcionesDeTienda(). Copia el error en un comentario y borra esa línea.
 *
 *  PISTA
 *    Si el descuento sale 322.65000000000003, redondéalo como en el ejercicio 2.3.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "5.1",
    title = "Funciones de la tienda",
    wikiLesson = "05-funciones/01-funciones.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre un parámetro y un argumento?
        - ¿Qué ganas con los argumentos con nombre y con los valores por defecto?
        - ¿Por qué es mejor que lineaDeTicket() DEVUELVA el texto en vez de imprimirlo?
    """.trimIndent(),
    solve = ::funcionesDeTienda,
)

fun funcionesDeTienda() {
    TODO("Ejercicio 5.1")
}
