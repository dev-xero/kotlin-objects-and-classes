package animals

class Dog(val name: String, weight: Int, breed: String) {
    val breed = breed.uppercase()
    var activities = arrayOf("walks")

    var weight: Int = weight
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = String.format("%.2f", weight / 2.2).toDouble()

    fun bark(): String {
        return if (weight < 20) "Yip!" else "Woof"
    }
}