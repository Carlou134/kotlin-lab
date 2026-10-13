package lab.domain

/**
 * Un ejercicio del lab.
 *
 * - [explanation] la escribes tú, con tus palabras. Mientras empiece con "TODO",
 *   el menú lo muestra como pendiente de explicar.
 * - [solve] es la función donde escribes tu solución. Mientras tenga TODO(),
 *   el menú avisa que está pendiente en vez de romperse.
 */
data class Exercise(
    val id: String,
    val title: String,
    val wikiLesson: String,
    val explanation: String,
    val solve: () -> Unit,
) {
    val hasExplanation: Boolean
        get() = !explanation.trimStart().startsWith("TODO")
}
