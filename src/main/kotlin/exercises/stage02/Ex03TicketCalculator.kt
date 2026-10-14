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
        - ¿Cuándo usas Int, Long y Double?
        Int para enteros. 
        Long cuando el valor entero es demasiado grande. 
        Double principalmente para numeros decimales.
        
        - ¿Qué pasa cuando divides dos Int?
        Cuando divides dos Int se hace la división entre enteros. Por lo que se trunca el resultado.
        
        - ¿Para qué sirve el operador %? Da un ejemplo real.
        El operador % sirve para calcular el resto de una división.
        Por ejemplo en el caso de 50 % 12. El resto de la division da igual 2.
        
        - ¿Cuánto da 10 + 5 * 2? ¿Y (10 + 5) * 2? ¿Por qué?
        El primero da 20, Porque primero se realiza la multiplicación
        El segundo da 30. Porque primero se realiza el parentesis antes de la multiplicación.
        
        - ¿Cuánto da 50 / 12 y cuánto da 50.0 / 12? ¿Por qué son distintos?
        El primero da 4. El segundo da 4.16. 
        Son distintos pq el primero maneja enteros y se trunca.
        El segundo uno de los valores ya es decimal.
        
        - ¿Por qué el truco de redondeo divide por 100.0 y no por 100?
        Porque Math.round() devuelve un Long (un entero). Si lo divido por 100, es una división
        entera y se pierden los decimales: 4293 / 100 = 42. Con 100.0 la división es Double: 42.93.
        Es lo mismo que pasa con 50 / 12.

    """.trimIndent(),
    solve = ::calculadoraDeTicket,
)

fun calculadoraDeTicket() {
    var unidadesVendidas = 0

    val precioArroz = 4.5
    val cantidadArroz = 10
    unidadesVendidas += cantidadArroz

    val precioAceite = 18.5
    val cantidadAceite = 4
    unidadesVendidas += cantidadAceite

    val precioCafe = 119.5
    val cantidadCafe = 1
    unidadesVendidas += cantidadCafe

    var tickets = 0

    val subtotal = (precioArroz * cantidadArroz) + (precioAceite * cantidadAceite) + (precioCafe * cantidadCafe)
    val impuesto = Math.round((subtotal * 0.18) * 100) / 100.0
    val total = Math.round((subtotal + impuesto) * 100) / 100.0
    val precioMasCaro = maxOf(precioArroz, precioAceite, precioCafe)
    tickets++

    val cajasCompletas: Int = 50 / 12
    val botellasSueltas = 50 % 12

    println("Subtotal: $subtotal\nImpuesto (18%): $impuesto\nTotal: $total")
    println("Precio unitario más caro: $precioMasCaro\nUnidades vendidas: $unidadesVendidas")
    println("Tickets emitidos: $tickets\nCajas completas: $cajasCompletas\nBotellas sueltas: $botellasSueltas")
}
