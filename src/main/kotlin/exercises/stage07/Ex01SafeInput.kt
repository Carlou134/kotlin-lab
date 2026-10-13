package exercises.stage07

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 7.1 — Registro seguro de cliente
 *  Wiki: 07-null-safety-y-errores/01-nulabilidad.md
 * ============================================================
 *
 *  OBJETIVO
 *    Manejar datos que pueden faltar con ?, ?., ?: y entender por qué evitar !!.
 *
 *  ENUNCIADO
 *    1. Escribe private fun pedirTexto(pregunta: String): String
 *       Imprime la pregunta, lee con readLine() y devuelve el texto sin espacios.
 *       Si readLine() devuelve null, devuelve "".
 *    2. Escribe private fun pedirNumero(pregunta: String): Int
 *       Repite la pregunta hasta que el usuario escriba un número válido (usa toIntOrNull()).
 *    3. En registroSeguro(), pide:
 *         - nombre (obligatorio): si viene vacío, usa "Invitado"
 *         - edad: con pedirNumero()
 *         - email (OPCIONAL): guárdalo en una variable String?. Si viene vacío, guarda null.
 *    4. Imprime:
 *         - la inicial del nombre SIN que explote si el nombre está vacío
 *           (prueba firstOrNull() combinado con ?:). Esto arregla el ejercicio 2.2.
 *         - el largo del email con ?. y, si no hay, "sin email" con ?:
 *    5. Uso del stock (vuelve al ejercicio 3.3):
 *         val stock = mutableMapOf("aceite" to 12)
 *       Descuenta 2 aceites calculando a partir del valor actual, de forma segura.
 *       Intenta lo mismo con "azúcar", que no existe: no debe explotar ni agregarse
 *       al map. Imprime "No hay azúcar en el inventario".
 *
 *  SALIDA ESPERADA (ejemplo)
 *    Nombre: Ana
 *    Edad: veinte
 *    Eso no es un número. Intenta de nuevo.
 *    Edad: 20
 *    Email (opcional):
 *    Ana (A), 20 años
 *    Largo del email: sin email
 *    No hay azúcar en el inventario
 *    Stock: {aceite=10}
 *
 *  EXPERIMENTO (responde en un comentario)
 *    Escribe val largo = email!!.length y ejecuta dejando el email vacío.
 *    ¿Qué error muestra el menú? ¿Por qué dicen que !! es "confía en mí"?
 *    Después borra esa línea.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex01 = Exercise(
    id = "7.1",
    title = "Registro seguro de cliente",
    wikiLesson = "07-null-safety-y-errores/01-nulabilidad.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué diferencia hay entre String y String?
        - ¿Qué hacen ?. y ?: ? Explícalo con el ejemplo del email.
        - ¿Por qué !! es peligroso y cuándo, si acaso, lo usarías?
    """.trimIndent(),
    solve = ::registroSeguro,
)

fun registroSeguro() {
    TODO("Ejercicio 7.1")
}
