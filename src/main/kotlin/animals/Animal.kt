package animals

open class Animal {
    open val image: String = ""
    open val food: String = ""
    open val habitat: String = ""
    var hunger: Int = 10
        set(value) {
            if (value > 0) field = value
        }

    open fun makeNoise() = println("Noises")
    open fun eat() = println("Eating")
    open fun roam() = println("Roaming")
    fun sleep() = println("Sleeping")
}

fun main() {
    val animals = arrayOf(
        Wolf(),
        Hippo()
    )

    for (animal: Animal in animals) {
        animal.eat()
        animal.roam()
        println()
    }
}