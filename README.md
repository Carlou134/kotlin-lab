# kotlin-lab

A Kotlin exercise lab for practicing what the **kotlin-android-wiki** teaches, stage by stage.

The idea is simple: pick a **concept**, then an **exercise**, read **your own explanation**, and run **your solution**, all from a terminal menu.

> **Current version: v1 — console.** A later v2 adds a graphical interface without rewriting the core (see [Roadmap](#roadmap)).

-----

## Requirements

| Tool | Version |
| --- | --- |
| JDK | 21 (LTS) |
| IntelliJ IDEA | Any recent version (Community is enough) |
| Gradle | Bundled through the Wrapper (`gradlew`), no install needed |

-----

## Running the lab

1. Open the project in IntelliJ IDEA and wait for the Gradle sync to finish.
2. Open `src/main/kotlin/main.kt`.
3. Click the **green arrow ▶** next to `fun main()`.
4. The menu shows up in the console panel:

```
==================================================
  KOTLIN LAB
==================================================
  1. Fundamentos  (0/3 explicados)
  2. Tipos y variables  (0/3 explicados)
  ...
  0. Salir
```

For exercise 1.3 (debugger), use **Debug** (the bug icon) instead of the green arrow.

> The menu and the exercise statements are written in Spanish, the language of the wiki.

-----

## Solving an exercise

Each exercise lives in its own file under `src/main/kotlin/exercises/stageNN/` and has three parts:

```kotlin
/*
 *  EJERCICIO 2.1 — Ficha de producto          <- 1. The statement: goal, steps,
 *  ...                                              expected output, rules and questions.
 */

val ex01 = Exercise(
    ...
    explanation = """                           <- 2. YOUR explanation, in your own words.
        TODO: explica con tus palabras ...           While it starts with "TODO",
    """.trimIndent(),                                it counts as pending.
    solve = ::fichaDeProducto,
)

fun fichaDeProducto() {
    TODO("Ejercicio 2.1")                       <- 3. Your solution: replace the TODO().
}
```

The workflow:

1. **Read** the wiki lesson named in the statement.
2. **Solve** the exercise by replacing `TODO()` with your code.
3. **Run** it from the menu and compare your output with the **expected output**.
4. **Answer** the statement's questions in comments.
5. **Explain** the concept in your own words in `explanation`, then delete the `TODO` line.

### What the menu shows

| Mark or message | Meaning |
| --- | --- |
| `[ ]` | You haven't written your explanation yet |
| `[x]` | Your explanation is written |
| `Pendiente: todavía no resolviste este ejercicio.` | The function still has `TODO()` |
| `El ejercicio terminó con un error: ...` | Your code threw an exception. The menu catches it and keeps running |

### Important rule: helpers must be `private`

Each stage is **a single package** with several files. If two exercises declare a public function or class with the same name (for example `subtotal()` or `Producto`), they clash and **nothing compiles**. Mark everything you declare inside an exercise as `private`.

-----

## Exercise map

| Stage | Exercise | File | Wiki lesson |
| --- | --- | --- | --- |
| **01 Fundamentals** | 1.1 Receipt header | `Ex01FirstProgram.kt` | `01-introduccion.md` |
| | 1.2 Reading errors | `Ex02ReadingErrors.kt` | `01-introduccion.md`, `02-del-editor-a-la-salida.md` |
| | 1.3 Stepping through code with the debugger | `Ex03Debugger.kt` | `03-entorno-intellij.md` |
| **02 Types and variables** | 2.1 Product card | `Ex01ProductCard.kt` | `01-tipos-y-variables.md` |
| | 2.2 Interactive greeting | `Ex02InteractiveGreeting.kt` | `02-texto.md` |
| | 2.3 Receipt calculator | `Ex03TicketCalculator.kt` | `03-numeros.md` |
| **03 Collections** | 3.1 Shopping list | `Ex01ShoppingList.kt` | `01-listas.md` |
| | 3.2 Unique tags | `Ex02UniqueTags.kt` | `02-sets.md` |
| | 3.3 Inventory | `Ex03Inventory.kt` | `03-maps.md` |
| **04 Control flow** | 4.1 Discount rules | `Ex01DiscountRules.kt` | `01-condicionales.md` |
| | 4.2 Stock report | `Ex02StockReport.kt` | `02-bucles.md` |
| | 4.3 Shelf search | `Ex03ShelfSearch.kt` | `02-bucles.md` |
| | 4.4 Guess the number | `Ex04GuessTheNumber.kt` | `02-bucles.md` |
| **05 Functions** | 5.1 Store functions | `Ex01StoreFunctions.kt` | `01-funciones.md` |
| | 5.2 Lambda calculator | `Ex02LambdaCalculator.kt` | `01-funciones.md` |
| | 5.3 Recursion | `Ex03Recursion.kt` | `02-recursion.md` |
| **06 OOP** | 6.1 The Product class | `Ex01ProductClass.kt` | `01-clases.md` |
| | 6.2 Customer account | `Ex02CustomerAccount.kt` | `02-getters-y-setters.md` |
| | 6.3 Orders: regular class vs data class | `Ex03OrderDataClass.kt` | `03-data-classes.md` |
| | 6.4 Order states | `Ex04OrderStatus.kt` | `04-enums.md` |
| **07 Null safety and errors** | 7.1 Safe customer sign-up | `Ex01SafeInput.kt` | `01-nulabilidad.md` |
| | 7.2 Warehouse exceptions | `Ex02StockExceptions.kt` | `02-excepciones.md` |
| | 7.3 **Capstone:** console mini store | `Ex03MiniStore.kt` | Stages 01–07 |
| | 7.4 Read the lab's own code | `Ex04ReadTheLab.kt` | Stages 01–07 |

Some exercises are linked on purpose:

- **2.2** breaks if you leave the name empty; you fix it in **7.1**.
- **3.3** updates stock "by hand"; **7.1** does it safely.
- The rules from **4.1** come back in the **7.3** capstone.
- **7.4** asks you to read the menu's own code. It's written almost entirely with what stages 01–07 cover.

-----

## Project structure

```
src/main/kotlin/
├── main.kt                         Entry point: wires the pieces together
├── lab/                            The lab's engine
│   ├── domain/
│   │   ├── Exercise.kt             What an exercise is
│   │   └── Concept.kt              What a concept is (one wiki stage)
│   ├── port/
│   │   └── ExerciseCatalog.kt      What the lab needs: "give me the concepts"
│   └── adapter/
│       ├── catalog/
│       │   └── InMemoryExerciseCatalog.kt   Where they come from: written in code
│       └── console/
│           └── ConsoleMenu.kt      How they're shown: a terminal menu
└── exercises/                      Your exercises
    ├── stage01/
    │   ├── Stage01.kt              Builds the concept with its exercises
    │   ├── Ex01FirstProgram.kt
    │   └── ...
    └── stage07/
```

The lab follows a **hexagonal architecture** (ports and adapters):

```
        ConsoleMenu  ──uses──▶  ExerciseCatalog (port)  ◀──implements──  InMemoryExerciseCatalog
     (driving adapter)                 │                                  (driven adapter)
                                       ▼
                               Concept / Exercise (domain)
```

- The **menu** doesn't know where exercises come from: it asks the port.
- The **catalog** doesn't know how they're displayed: it just provides them.
- The **domain** knows nothing about either.

That's why swapping the console for a graphical interface means **adding an adapter**, not rewriting the lab.

### Adding an exercise

1. Create `ExNNName.kt` in its stage folder, following the same format as the others.
2. Add its `val exNN` to the list in `StageNN.kt`.

### Adding a stage

1. Create the `exercises/stageNN/` folder with its `StageNN.kt` and exercises.
2. Import `stageNN` in `InMemoryExerciseCatalog.kt` and add it to the list.

-----

## Roadmap

| Version | What it adds | Status |
| --- | --- | --- |
| **v1 — console** | Terminal menu + exercises for stages 01–07 | In progress |
| v1.x | Exercises for stage 08 onward | Planned |
| v1.x | Automated tests to check solutions (after stage 19, Testing) | Planned |
| **v2 — platform** | Compose UI as a new adapter, reusing `lab/domain` and `lab/port` | Future |

-----

## License

[MIT](LICENSE)
