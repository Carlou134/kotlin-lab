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
        - ¿Qué diferencia hay entre listOf y mutableListOf?
        Un listOf es una lista inmutable de datos. Es decir solo lectura. 
        Un mutableListOf es una lista que permite hacer modificaciones.
        
        - Si la lista es val, ¿por qué igual puedo agregarle elementos a una mutableList?
        Porque val congela la variable, no el contenido. La variable no puede apuntar a OTRA lista,
        pero si la lista es mutable, puedo agregar y quitar elementos adentro.
        Es como una caja con etiqueta: la etiqueta no se puede pegar en otra caja, pero puedo
        meter y sacar cosas de la caja.

        - ¿Qué diferencia hay entre un array y una lista?
        La diferencia es el tamaño. Un array tiene tamaño fijo: puedo cambiar sus elementos,
        pero no agregar ni quitar. Una mutableList puede crecer y achicarse.
        (Un listOf tampoco crece, pero además no deja cambiar sus elementos: es solo lectura.)
        
        Cuando imprimes directamente el array, no muestra su contenido sino su tipo y un código:
            [Ljava.lang.Double;@3b192d32
        "[Ljava.lang.Double;" significa "array de Double" y lo que va después de @ es su hashCode
        en hexadecimal (no es la dirección en memoria). Por eso existe contentToString().

        Cuando intentas añadir un elemento a una lista de solo lectura te sale el siguiente error:
            Ex01ShoppingList.kt:101:11 Unresolved reference 'add'.
        El tipo List directamente no tiene la función add(): no es que esté bloqueada, es que no existe.
        Las funciones de modificación solo están en MutableList.
        
    """.trimIndent(),
    solve = ::listaDeCompras,
)

fun listaDeCompras() {
    val lista = listOf("pan", "leche", "huevos", "café")

    println(lista)
    println("Tamaño: ${lista.size}\nPrimero: ${lista[0]}\nÚltimo: ${lista[lista.size - 1]}")
    println("¿Tiene leche? ${lista.contains("leche")}\n¿Tiene arroz? ${lista.contains("arroz")}")

    val copiaLista = mutableListOf<String>()
    copiaLista.addAll(lista)
    copiaLista.add("arroz")
    copiaLista.add(0, "agua")
    copiaLista.remove("huevos")
    copiaLista[copiaLista.indexOf("café")] = "té"

    println("Tamaño: ${copiaLista.size}")
    println(copiaLista)

    val arrayPrecios = arrayOf(3.5, 4.2, 12.0)
    arrayPrecios[1] = 3.9
    println(arrayPrecios.contentToString())
}
