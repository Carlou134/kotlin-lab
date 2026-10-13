package exercises.stage06

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 6.2 — Cuenta de cliente
 *  Wiki: 06-poo/02-getters-y-setters.md
 * ============================================================
 *
 *  OBJETIVO
 *    Controlar qué se guarda y qué se lee con setters, getters, field
 *    y propiedades calculadas.
 *
 *  ENUNCIADO
 *    Declara private class Cliente(nombreInicial: String, emailInicial: String) con:
 *
 *      1. var email: String
 *         Setter: guarda el valor sin espacios y en minúsculas (usa field).
 *      2. val emailValido: Boolean
 *         Propiedad CALCULADA (get()): true si contiene "@" y ".".
 *      3. var nombre: String
 *         Setter: guarda el valor sin espacios. Si queda vacío, NO cambia el nombre.
 *      4. var puntos: Int = 0, con private set
 *         Nadie de afuera puede cambiarlos directamente.
 *      5. fun registrarCompra(monto: Double)
 *         Suma 1 punto por cada 10 soles completos (95.0 -> 9 puntos).
 *      6. val nivel: String
 *         Calculada con when: menos de 50 -> "Bronce", hasta 99 -> "Plata", 100 o más -> "Oro".
 *
 *    En cuentaDeCliente():
 *      - crea un cliente con email "  ANA@Tienda.COM  "
 *      - imprime el email y si es válido
 *      - cámbialo a "ana-sin-arroba" y vuelve a imprimir
 *      - intenta poner un nombre "   " y comprueba que no cambió
 *      - registra compras de 95.0, 320.0 y 700.0, e imprime puntos y nivel después de cada una
 *
 *  SALIDA ESPERADA (aproximada)
 *    Email: ana@tienda.com (válido: true)
 *    Email: ana-sin-arroba (válido: false)
 *    Nombre: Ana
 *    Puntos: 9 -> Bronce
 *    Puntos: 41 -> Bronce
 *    Puntos: 111 -> Oro
 *
 *  OJO, TRAMPA
 *    El valor INICIAL de una propiedad no pasa por su setter. Si escribes
 *      var email: String = emailInicial
 *    el email del constructor NO se limpia. ¿Cómo lo resuelves? (pista: init)
 *
 *  PREGUNTA (responde en un comentario)
 *    Intenta hacer cliente.puntos = 1000 desde cuentaDeCliente(). ¿Qué error da?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex02 = Exercise(
    id = "6.2",
    title = "Cuenta de cliente",
    wikiLesson = "06-poo/02-getters-y-setters.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Qué es field y por qué no puedes escribir email = value dentro del setter?
        - ¿Qué diferencia hay entre una propiedad guardada y una calculada?
        - ¿Para qué sirve private set? ¿Qué protege?
    """.trimIndent(),
    solve = ::cuentaDeCliente,
)

fun cuentaDeCliente() {
    TODO("Ejercicio 6.2")
}
