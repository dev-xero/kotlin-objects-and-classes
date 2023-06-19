package animals

class Hippo : Animal() {
    override val image: String
        get() = "hippo.jpg"

    override val food: String
        get() = "grass"

    override val habitat: String
        get() = "water"

    override fun eat() = println("The hippo is eating $food")
    override fun makeNoise() = println("Grunt Grunt!")
    override fun roam() = println("The hippo is roaming")
}

fun main() {
    val hippo = Hippo()
    hippo.hunger = 90

    println("This hippo lives in the ${hippo.habitat}")
    println("This hippo is ${if (hippo.hunger > 40) "not" else ""} hungry")
    hippo.eat()
}