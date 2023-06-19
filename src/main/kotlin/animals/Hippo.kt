package animals

class Hippo : Animal() {
    override val image: String
        get() = "hippo.jpg"

    override val food: String
        get() = "grass"

    override val habitat: String
        get() = "water"

    override fun eat() = println("The hippo is eating grass")
    override fun makeNoise() = println("The hippo is grunting")
    override fun roam() = println("The hippo is roaming")
}

fun main() {
    val hippo = Hippo()

    println("This hippo lives in the ${hippo.habitat}")
    hippo.eat()
}