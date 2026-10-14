package exercises.stage02

import lab.domain.Exercise

/*
 * ============================================================
 *  EJERCICIO 2.2 — Saludo interactivo
 *  Wiki: 02-tipos-y-variables/02-texto.md
 * ============================================================
 *
 *  OBJETIVO
 *    Practicar String, Char, plantillas, readLine() y secuencias de escape.
 *
 *  ENUNCIADO
 *    1. Pregunta el nombre y la ciudad del usuario. Léelos así:
 *         val nombre = readLine() ?: ""
 *       El "?: """ lo entiendes a fondo en la etapa 07. Por ahora úsalo tal cual.
 *    2. Saluda usando plantillas: $nombre para una variable, ${...} para una expresión.
 *    3. Muestra el nombre en mayúsculas y cuántas letras tiene.
 *    4. Guarda la primera letra en una variable de tipo Char y muéstrala entre comillas simples.
 *    5. Imprime una "ficha" usando \t (tabulación), \n (salto de línea) y \" (comillas).
 *
 *  SALIDA ESPERADA (si escribes Ana y Lima)
 *    ¿Cómo te llamas? Ana
 *    ¿De qué ciudad eres? Lima
 *    ¡Hola, Ana de Lima!
 *    Tu nombre en mayúsculas: ANA
 *    Tu nombre tiene 3 letras y empieza con 'A'
 *    Ficha:
 *    	Nombre:	"Ana"
 *    	Ciudad:	"Lima"
 *
 *  REGLAS
 *    - Usa print() para las preguntas, así la respuesta queda en la misma línea.
 *    - La ficha se imprime con UN SOLO println().
 *
 *  PREGUNTA (responde en un comentario)
 *    Ejecuta el ejercicio y deja el nombre VACÍO (presiona Enter directo).
 *    ¿Qué pasa? Anota el error. Lo arreglas en el ejercicio 7.1.
 *
 *  CUANDO TERMINES
 *    Escribe la explicación de abajo con tus palabras.
 */

val ex02 = Exercise(
    id = "2.2",
    title = "Saludo interactivo",
    wikiLesson = "02-tipos-y-variables/02-texto.md",
    explanation = """
        - ¿Qué diferencia hay entre String y Char? ¿Por qué usan comillas distintas?
        char se usa para un caracter, string es una cadena de caracteres
        En kotlin ya viene definido el usar comillas distintas.
        
        - ¿Qué ventaja tienen las plantillas frente a concatenar con +?
        En las plantillas es mucho mas ordenado puedes escribir todo de una, 
        en cuanto a la concatenación tienes que estar regularmente agregando el simbolo + 
        
        - ¿Qué hace readLine() con el programa mientras esperas?
        Frena el programa hasta que el usuario escribe algo y presiona Enter.
        Después devuelve lo que escribió como String.
        
        - Ejecuta el ejercicio y deja el nombre VACÍO (presiona Enter directo).
            *    ¿Qué pasa? Anota el error. Lo arreglas en el ejercicio 7.1.
                 Lo que pasa es que se guarda como cadena vacia y estan intentando acceder a una posicion que no tiene valor
                 java.lang.StringIndexOutOfBoundsException: Index 0 out of bounds for length 0
        
    """.trimIndent(),
    solve = ::saludoInteractivo,
)

fun saludoInteractivo() {
    print("¿Cómo te llamas?: ")
    val nombre = readLine() ?: ""

    print("¿De qué ciudad eres?: ")
    val ciudad = readLine() ?: ""

    val letra:Char = nombre[0]

    println("¡Hola, $nombre de $ciudad!")
    println("Tu nombre en mayúsculas: ${nombre.uppercase()}")
    println("Tu nombre tiene ${nombre.length} letras y empieza con '$letra'")
    println("Ficha:\nNombre:\t\"$nombre\"\nCiudad:\t\"$ciudad\"")
}
