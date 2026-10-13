package exercises.stage02

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 2.3 — Calculadora de ticket
 *  Wiki: 02-tipos-y-variables/03-numeros.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar Int y Double, los operadores (+ - * / %), +=, ++,
 *    el orden de las operaciones y Math.
 *
 *  ENUNCIADO
 *    Una clienta compra:
 *      - Arroz:  4.5 por unidad, 10 unidades
 *      - Aceite: 18.5 por unidad, 4 unidades
 *      - Café:   119.5 por unidad, 1 unidad
 *
 *    1. Calcula el subtotal de la compra.
 *    2. Calcula el impuesto (18%) y el total. Redondea los dos a 2 decimales
 *       con este truco: Math.round(valor * 100) / 100.0
 *    3. Con Math.max, encuentra el precio unitario más caro.
 *    4. Cuenta las unidades vendidas en una var, sumando con += producto por producto.
 *    5. Cuenta los tickets emitidos en otra var, usando ++.
 *    6. El almacén guarda 50 botellas de aceite en cajas de 12:
 *       ¿cuántas cajas completas salen (/) y cuántas botellas sobran (%)?
 *
 *  SALIDA ESPERADA
 *    Subtotal: 238.5
 *    Impuesto (18%): 42.93
 *    Total: 281.43
 *    Precio unitario más caro: 119.5
 *    Unidades vendidas: 15
 *    Tickets emitidos: 1
 *    Cajas completas: 4
 *    Botellas sueltas: 2
 *
 *  PREGUNTAS (responde en comentarios)
 *    a) ¿Cuánto da 10 + 5 * 2? ¿Y (10 + 5) * 2? ¿Por qué?
 *    b) ¿Cuánto da 50 / 12 y cuánto da 50.0 / 12? ¿Por qué son distintos?
 *    c) ¿Por qué el truco de redondeo divide por 100.0 y no por 100?
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex03 = Exercise(
    id = "2.3",
    title = "Calculadora de ticket",
    wikiLesson = "02-tipos-y-variables/03-numeros.md",
    explanation = """
        TODO: explica con tus palabras (borra esta línea al terminar).
        - ¿Cuándo usas Int, Long y Double?
        - ¿Qué pasa cuando divides dos Int?
        - ¿Para qué sirve el operador %? Da un ejemplo real.
    """.trimIndent(),
    solve = ::calculadoraDeTicket,
)

fun calculadoraDeTicket() {
    TODO("Ejercicio 2.3")
}
