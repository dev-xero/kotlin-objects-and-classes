package animals

class Wolf : Canine() {
    override val image: String
        get() = "wolf.jpg"

    override val food: String
        get() = "meat"

    override val habitat: String
        get() = "forests"

    override fun eat() = println("The wolf is eating $food")
    override fun makeNoise() = println("Hoooowl!")
    override fun roam() = println("The wolf is roaming")
}

fun main() {
    val wolf = Wolf()
    wolf.hunger = 60

    wolf.eat()
    wolf.makeNoise()
}