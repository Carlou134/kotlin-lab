package lab.port

import lab.domain.Concept

/** Puerto: lo que el lab necesita para obtener los ejercicios, sin decir de dónde salen. */
interface ExerciseCatalog {
    fun concepts(): List<Concept>
}
