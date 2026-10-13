package lab.adapter.catalog

import exercises.stage01.stage01
import exercises.stage02.stage02
import exercises.stage03.stage03
import exercises.stage04.stage04
import exercises.stage05.stage05
import exercises.stage06.stage06
import exercises.stage07.stage07
import lab.domain.Concept
import lab.port.ExerciseCatalog

/**
 * Adaptador de salida: la fuente de los ejercicios.
 *
 * Hoy están "en memoria" (escritos en el código). Si mañana vinieran
 * de archivos o de una API, se crea otro adaptador y el menú no se entera.
 */
class InMemoryExerciseCatalog : ExerciseCatalog {
    override fun concepts(): List<Concept> = listOf(
        stage01, stage02, stage03, stage04, stage05, stage06, stage07,
    )
}
