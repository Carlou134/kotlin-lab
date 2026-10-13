package exercises.stage04

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 4.1 — Reglas de descuento
 *  Wiki: 04-control-de-flujo/01-condicionales.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar if/else, when con rangos y los operadores && || !
 *
 *  ENUNCIADO
 *    Empieza con estos datos (cámbialos para probar otros casos):
 *      val monto = 250
 *      val esSocio = true
 *      val dia = "sábado"
 *
 *    1. Descuento base con when y rangos:
 *         monto menor a 0    -> "Monto inválido" (y no calcules nada más)
 *         0 a 99             -> 0%
 *         100 a 499          -> 5%
 *         500 a 999          -> 10%
 *         1000 o más         -> 15%
 *    2. Si es socio Y el descuento base es mayor a 0, suma 5% más.
 *    3. Envío:
 *         sábado O domingo   -> "gratis (fin de semana)"
 *         monto de 200 o más -> "gratis (compra grande)"
 *         en otro caso       -> "10.0"
 *    4. Si NO es socio, imprime "¿Quieres hacerte socio?".
 *    5. Calcula e imprime el total con el descuento final aplicado.
 *
 *  SALIDA ESPERADA (con los datos de arriba)
 *    Monto: 250
 *    Descuento base: 5%
 *    Descuento final: 10%
 *    Envío: gratis (fin de semana)
 *    Total a pagar: 225.0
 *
 *  REGLAS
 *    - El paso 1 con when (monto) { in ... -> ... }.
 *    - El paso 3 con un when SIN argumento: when { condición -> ... }.
 *    - Usa el if como EXPRESIÓN al menos una vez: val x = if (...) a else b
 *
 *  PRUEBAS (pega la salida de cada una en un comentario)
 *    a) monto = 1200, esSocio = false, dia = "martes"
 *    b) monto = 80,   esSocio = true,  dia = "lunes"
 *    c) monto = -5
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "4.1",
    title = "Reglas de descuento",
    wikiLesson = "04-control-de-flujo/01-condicionales.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Cuándo prefieres when en vez de una cadena de if / else if?
        - ¿Qué diferencia hay entre && y ||? Explícalo con el caso del envío.
        - ¿Qué significa que en Kotlin if y when sean expresiones?
    """.trimIndent(),
    solve = ::reglasDeDescuento,
)

fun reglasDeDescuento() {
    TODO("Ejercicio 4.1")
}
