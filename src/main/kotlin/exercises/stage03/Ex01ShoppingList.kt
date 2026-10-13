package exercises.stage03

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 3.1 — Lista de compras
 *  Wiki: 03-colecciones/01-listas.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar listOf, mutableListOf, índices, size y arrays.
 *
 *  ENUNCIADO
 *    Parte A — lista de solo lectura
 *      1. Crea una lista con: "pan", "leche", "huevos", "café".
 *      2. Imprime la lista, su tamaño, el primer elemento y el último.
 *         El último sácalo con un índice calculado a partir de size, no con el 3 escrito a mano.
 *      3. Imprime si la lista contiene "leche" y si contiene "arroz".
 *
 *    Parte B — lista modificable
 *      4. Crea una copia modificable de la lista anterior.
 *      5. Agrega "arroz" al final y "agua" en la posición 0.
 *      6. Quita "huevos".
 *      7. Reemplaza "café" por "té" usando su índice.
 *      8. Imprime la lista final y su tamaño.
 *
 *    Parte C — array
 *      9. Crea un array con los precios 3.5, 4.2 y 12.0.
 *     10. Cambia el segundo precio a 3.9.
 *     11. Imprime el array directamente con println(). ¿Qué sale?
 *         Después imprímelo con .contentToString().
 *
 *  SALIDA ESPERADA (aproximada)
 *    [pan, leche, huevos, café]
 *    Tamaño: 4
 *    Primero: pan
 *    Último: café
 *    ¿Tiene leche? true
 *    ¿Tiene arroz? false
 *    [agua, pan, leche, té, arroz]
 *    Tamaño: 5
 *    [3.5, 3.9, 12.0]
 *
 *  REGLAS
 *    - Sin bucles: todavía no los viste (etapa 04).
 *    - Intenta hacer .add() sobre la lista de la Parte A. Lee el error,
 *      cópialo en un comentario y comenta la línea.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "3.1",
    title = "Lista de compras",
    wikiLesson = "03-colecciones/01-listas.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre listOf y mutableListOf?
        - Si la lista es val, ¿por qué igual puedo agregarle elementos a una mutableList?
        - ¿Qué diferencia hay entre un array y una lista?
    """.trimIndent(),
    solve = ::listaDeCompras,
)

fun listaDeCompras() {
    TODO("Ejercicio 3.1")
}
