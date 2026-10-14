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
        - ¿Qué diferencia hay entre un error de compilación y uno de ejecución?
        Un error de compilación es cuando el programa ni siquiera arranca, debido a que el compilador no permite
        continuar si encuentra un problema en el código: de sintaxis (falta una comilla), un nombre que no
        existe (printn) o tipos que no encajan.
        Un error de ejecución es cuando el programa se cae al estar en ejecución.
        
        - ¿Cuál de los cuatro errores NO lo detectó el compilador? ¿Por qué crees que pasa?
        El error que no lo detecta es la división entre 0. El código está bien escrito; el problema aparece
        recién cuando se calcula el valor, mientras el programa corre.
        
        - ¿Qué parte del mensaje de error te dice en qué línea está el problema?
        Al intentar compilar, aparece el archivo que ha ocasionado el error seguido de dos puntos :
        Al costado estan dos numeros L:C. El primero es la línea y el segundo la columna donde
        se encuentra el error. Por ejemplo, 65:25 es línea 65, columna 25.

        Error de compilacion:
        - Ex02ReadingErrors.kt:65:25 Syntax error: Expecting '"'.
        - Ex02ReadingErrors.kt:75:5 Unresolved reference 'printn'.
        - Ex02ReadingErrors.kt:75:24 Syntax error: Expecting an element.
        
        Error de ejecución:
        - java.lang.ArithmeticException: / by zero
        
    """.trimIndent(),
    solve = ::leerErrores,
)

fun leerErrores() {
    println("Hola mundo")
    print("Bienvenido a la tienda\n")
    println("Total: " + "100\n")
    println(100 / 2)
}
