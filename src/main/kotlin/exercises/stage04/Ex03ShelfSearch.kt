package exercises.stage04

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 4.3 — Buscar en los estantes
 *  Wiki: 04-control-de-flujo/02-bucles.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar bucles anidados, break, continue y etiquetas.
 *
 *  ENUNCIADO
 *    Los estantes de la tienda (un "" es un hueco vacío):
 *      val estantes = listOf(
 *          listOf("arroz", "", "azúcar"),
 *          listOf("aceite", "fideos", ""),
 *          listOf("", "leche", "café"),
 *      )
 *
 *    1. Recorre todos los estantes e imprime cada producto con su posición.
 *       Salta los huecos con continue. Numera desde 1, no desde 0.
 *    2. Cuenta los huecos vacíos (en otro recorrido).
 *    3. Busca "leche". Cuando la encuentres, imprime dónde está y corta LOS DOS bucles
 *       con un break con etiqueta (busqueda@).
 *    4. Para comprobar que el corte funciona, imprime "Revisando estante X" al entrar a cada
 *       estante durante la búsqueda.
 *
 *  SALIDA ESPERADA
 *    Estante 1, posición 1: arroz
 *    Estante 1, posición 3: azúcar
 *    Estante 2, posición 1: aceite
 *    Estante 2, posición 2: fideos
 *    Estante 3, posición 2: leche
 *    Estante 3, posición 3: café
 *    Huecos vacíos: 3
 *    Revisando estante 1
 *    Revisando estante 2
 *    Revisando estante 3
 *    ¡Leche encontrada en estante 3, posición 2!
 *
 *  PREGUNTA (responde en un comentario)
 *    Cambia la búsqueda a "aceite". ¿Cuántas veces aparece "Revisando estante"?
 *    ¿Qué pasaría si usaras un break SIN etiqueta?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "4.3",
    title = "Buscar en los estantes",
    wikiLesson = "04-control-de-flujo/02-bucles.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre break y continue?
        - ¿Para qué sirve una etiqueta como busqueda@?
        - ¿Cuántas vueltas en total da un bucle anidado de 3 x 3?
    """.trimIndent(),
    solve = ::buscarEnEstantes,
)

fun buscarEnEstantes() {
    TODO("Ejercicio 4.3")
}
