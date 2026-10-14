package exercises.stage01

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 1.3 — Recorrer código con el debugger
 *  Wiki: 01-fundamentos/03-entorno-intellij.md
 *        01-fundamentos/02-del-editor-a-la-salida.md
 * ============================================================
 *
 *  OBJETIVO
 *    Usar el debugger de IntelliJ para ver el programa "en cámara lenta".
 *
 *  ENUNCIADO
 *    El código de recorridoConDebugger() YA ESTÁ ESCRITO. No lo cambies.
 *    Usa "var", que todavía no viste (llega en la etapa 02). Por ahora solo
 *    importa que "stock" es una caja con un número que va cambiando.
 *
 *    1. Pon un breakpoint en la primera línea (clic en el número de línea:
 *       aparece un punto rojo).
 *    2. Ejecuta main.kt con Debug (el bichito, no la flecha verde).
 *    3. En el menú, entra a 1 > 3 y responde "s" para ejecutar.
 *    4. Avanza línea por línea con Step Over (F8) y mira el panel Variables.
 *
 *  PREGUNTAS (responde aquí abajo, en comentarios)
 *    a) ¿Qué valor tiene "stock" justo ANTES de ejecutar cada println?
 *    b) ¿Qué diferencia hay entre Step Over (F8) y Step Into (F7)?
 *    c) ¿Qué hace Resume Program (F9)?
 *
 *  RETO EXTRA (lección 02, del editor a la salida)
 *    Busca en la carpeta build/classes el archivo .class que el compilador
 *    generó para ESTE archivo. ¿Cómo se llama? ¿Por qué tiene ese nombre?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "1.3",
    title = "Recorrer código con el debugger",
    wikiLesson = "01-fundamentos/03-entorno-intellij.md",
    explanation = """
        - ¿Qué es un breakpoint y para qué sirve?
        Es un punto de interrupción, sirve para detener el programa en puntos especificos y el usuario decide
        cuando continuar
        
        - ¿Qué recorrido hace tu código desde el .kt hasta que ves la salida?
          (compilador, bytecode, JVM)
          El compilador lo traduce a bytecode. Luego la Java Virtual Machine se encarga de ejecutarlo. 
          
        - ¿Qué valor tiene "stock" justo ANTES de ejecutar cada println?
        Primero inicia con 10, luego tiene 7, luego continua con 12. Finalmente tiene 24. 
        
        - ¿Qué diferencia hay entre Step Over (F8) y Step Into (F7)?
        Step Over ejecuta la línea completa, incluidas las funciones que llame, sin entrar en ellas.
        Step Into, si la línea llama a una función, entra en ella y la recorre por dentro.

        - ¿Qué hace Resume Program (F9)?
        Continúa la ejecución hasta el próximo breakpoint, o hasta el final si no hay más.
          
    """.trimIndent(),
    solve = ::recorridoConDebugger,
)

fun recorridoConDebugger() {
    var stock = 10
    println("Stock inicial: $stock")
    stock = stock - 3
    println("Después de vender 3: $stock")
    stock = stock + 5
    println("Después de reponer 5: $stock")
    stock = stock * 2
    println("Al duplicar el pedido: $stock")
}
