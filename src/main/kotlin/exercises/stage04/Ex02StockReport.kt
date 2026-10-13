package exercises.stage04

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 4.2 — Reporte de stock
 *  Wiki: 04-control-de-flujo/02-bucles.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar for con rangos (.., until, downTo, step) y recorrer listas y maps.
 *
 *  ENUNCIADO
 *    1. Imprime "Caja 1" a "Caja 3" con un rango cerrado (..).
 *    2. Imprime los índices de la lista ["pan", "leche", "café"] con until,
 *       en el formato "0 -> pan".
 *    3. Cuenta regresiva para abrir la tienda: de 10 a 0, de 2 en 2 (downTo + step).
 *    4. Con este stock:
 *         val stock = mapOf("arroz" to 30, "aceite" to 3, "café" to 0, "azúcar" to 12)
 *       recorre el map desestructurando (clave, valor) y marca:
 *         0          -> "AGOTADO"
 *         menos de 5 -> "REPONER"
 *         el resto   -> "OK"
 *    5. En el mismo recorrido, suma el total de unidades y cuenta cuántos productos hay que reponer
 *       (los agotados también cuentan).
 *
 *  SALIDA ESPERADA
 *    Caja 1
 *    Caja 2
 *    Caja 3
 *    0 -> pan
 *    1 -> leche
 *    2 -> café
 *    Abrimos en: 10 8 6 4 2 0
 *    arroz: 30 (OK)
 *    aceite: 3 (REPONER)
 *    café: 0 (AGOTADO)
 *    azúcar: 12 (OK)
 *    Unidades totales: 45
 *    Productos a reponer: 2
 *
 *  REGLAS
 *    - La cuenta regresiva sale en UNA línea: usa print() dentro del bucle.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex02 = Exercise(
    id = "4.2",
    title = "Reporte de stock",
    wikiLesson = "04-control-de-flujo/02-bucles.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre 0..3 y 0 until 3? ¿Por qué until encaja con los índices?
        - ¿Qué significa desestructurar (clave, valor) en un for?
        - ¿Por qué el acumulador del total tiene que ser var y estar FUERA del bucle?
    """.trimIndent(),
    solve = ::reporteDeStock,
)

fun reporteDeStock() {
    TODO("Ejercicio 4.2")
}
