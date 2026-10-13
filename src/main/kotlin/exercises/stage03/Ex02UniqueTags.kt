package exercises.stage03

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 3.2 — Etiquetas únicas
 *  Wiki: 03-colecciones/02-sets.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar setOf, mutableSetOf, elementAt() y cómo un set descarta repetidos.
 *
 *  ENUNCIADO
 *    Tres productos tienen estas etiquetas:
 *      - Producto 1: "oferta", "nuevo", "lácteos"
 *      - Producto 2: "oferta", "bebidas"
 *      - Producto 3: "nuevo", "bebidas", "oferta"
 *
 *    1. Crea UNA lista con las 8 etiquetas (con repetidos) e imprime su tamaño.
 *    2. Crea un set con las mismas 8 etiquetas e imprime el set y su tamaño.
 *    3. Imprime la primera etiqueta del set con elementAt(0).
 *    4. Crea un set modificable vacío de String. Agrega "oferta" DOS veces e
 *       imprime lo que devuelve cada .add(). ¿Qué te dice ese valor?
 *    5. Agrega "temporada", quita "oferta" e imprime el set final.
 *
 *  SALIDA ESPERADA (aproximada)
 *    Lista: 8 etiquetas
 *    Set: [oferta, nuevo, lácteos, bebidas] -> 4 etiquetas
 *    Primera: oferta
 *    ¿Agregó "oferta"? true
 *    ¿Agregó "oferta" otra vez? false
 *    [temporada]
 *
 *  REGLAS
 *    - Sin bucles.
 *    - Para crear un set modificable vacío tienes que decirle el tipo:
 *      mutableSetOf<String>(). ¿Por qué crees que lo necesita?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex02 = Exercise(
    id = "3.2",
    title = "Etiquetas únicas",
    wikiLesson = "03-colecciones/02-sets.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué problema resuelve un set que una lista no?
        - ¿Por qué en un set no se usa set[0] como en una lista?
        - Da un ejemplo real (de una tienda) donde usarías un set.
    """.trimIndent(),
    solve = ::etiquetasUnicas,
)

fun etiquetasUnicas() {
    TODO("Ejercicio 3.2")
}
