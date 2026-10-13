package exercises.stage01

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 1.2 — Leer errores
 *  Wiki: 01-fundamentos/01-introduccion.md
 *        01-fundamentos/02-del-editor-a-la-salida.md
 * ============================================================
 *
 *  OBJETIVO
 *    Perderle el miedo a los mensajes de error y saber distinguir
 *    un error de COMPILACIÓN de un error de EJECUCIÓN.
 *
 *  ENUNCIADO
 *    En leerErrores() hay cuatro líneas comentadas, y cada una tiene un problema.
 *    Para cada una:
 *      1. Descoméntala (solo UNA a la vez).
 *      2. Ejecuta el lab y lee el mensaje de error COMPLETO.
 *      3. Copia el mensaje en un comentario debajo de la línea.
 *      4. Anota si es error de compilación o de ejecución.
 *      5. Corrígela (en el caso de la división, cambia el 0 por otro número).
 *
 *  SALIDA ESPERADA (al final, con todo corregido)
 *    Hola mundo
 *    Bienvenido a la tienda
 *    Total: 100
 *    50
 *
 *  PISTAS
 *    - Si el programa ni siquiera arranca, el error es de compilación.
 *    - Si arranca y se cae en medio, es de ejecución. El menú te muestra
 *      ese error como "El ejercicio terminó con un error: ...".
 *
 *  CUANDO TERMINES
 *    Borra el TODO(), deja las cuatro líneas corregidas y escribe la explicación.
 */

val ex02 = Exercise(
    id = "1.2",
    title = "Leer errores",
    wikiLesson = "01-fundamentos/01-introduccion.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre un error de compilación y uno de ejecución?
        - ¿Cuál de los cuatro errores NO lo detectó el compilador? ¿Por qué crees que pasa?
        - ¿Qué parte del mensaje de error te dice en qué línea está el problema?
    """.trimIndent(),
    solve = ::leerErrores,
)

fun leerErrores() {
    // println("Hola mundo)
    // printn("Bienvenido a la tienda")
    // println("Total: " + )
    // println(100 / 0)

    TODO("Ejercicio 1.2: borra este TODO cuando hayas corregido las cuatro líneas")
}
