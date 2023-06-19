package animals

class Animal {
    val image: String = ""
    val food: String = ""
    val habitat: String = ""
    var hunger: Int = 10
        set(value) {
            if (value > 0) field = value
        }

    fun makeNoise() = println("Noises")
    fun roam() = println("Roaming")
    fun eat() = println("Eating")
    fun sleep() = println("Sleeping")
}