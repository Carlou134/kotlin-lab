import lab.adapter.catalog.InMemoryExerciseCatalog
import lab.adapter.console.ConsoleMenu

// Punto de entrada: acá se "enchufan" las piezas del lab.
// El menú recibe el catálogo desde afuera; no lo crea él mismo.
fun main() {
    val catalog = InMemoryExerciseCatalog()
    val menu = ConsoleMenu(catalog)
    menu.start()
}
