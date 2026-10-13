package exercises.stage03

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 3.3 — Inventario
 *  Wiki: 03-colecciones/03-maps.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar mapOf, mutableMapOf, claves, valores, put() y remove().
 *
 *  ENUNCIADO
 *    Parte A — precios (solo lectura)
 *      1. Crea un map producto -> precio:
 *         "arroz" to 4.5, "aceite" to 18.5, "café" to 119.5
 *      2. Imprime el precio del aceite usando la clave.
 *      3. Imprime el precio de "azúcar" (no existe). ¿Qué sale?
 *      4. Imprime todas las claves, todos los valores y el tamaño.
 *
 *    Parte B — stock (modificable)
 *      5. Crea un map modificable producto -> stock:
 *         "arroz" to 30, "aceite" to 12
 *      6. Agrega "café" con 5 unidades usando put().
 *      7. Se vendieron 2 aceites: actualiza su stock usando la clave.
 *      8. El arroz se dejó de vender: quítalo con remove().
 *      9. Imprime el map final.
 *
 *  SALIDA ESPERADA (aproximada)
 *    Precio del aceite: 18.5
 *    Precio del azúcar: null
 *    Productos: [arroz, aceite, café]
 *    Precios: [4.5, 18.5, 119.5]
 *    Cantidad: 3
 *    Stock final: {aceite=10, café=5}
 *
 *  REGLAS
 *    - Sin bucles.
 *    - En el paso 7, escribe el 10 a mano. Cuando llegues a la etapa 07 vas
 *      a poder calcularlo a partir del valor actual de forma segura.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "3.3",
    title = "Inventario",
    wikiLesson = "03-colecciones/03-maps.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué es una clave y qué es un valor en un map?
        - ¿Por qué buscar "azúcar" devuelve null en vez de romper el programa?
        - ¿Cuándo elegirías un map en vez de una lista?
    """.trimIndent(),
    solve = ::inventario,
)

fun inventario() {
    TODO("Ejercicio 3.3")
}
