package lab.domain

/** Un concepto del lab: corresponde a una carpeta de la wiki y agrupa sus ejercicios. */
data class Concept(
    val number: Int,
    val title: String,
    val wikiFolder: String,
    val exercises: List<Exercise>,
)
