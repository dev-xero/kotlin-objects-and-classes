package animals

class Dog(val name: String, var weight: Int, breedParam: String) {
    val breed = breedParam.uppercase()
    var activities = arrayOf("walks")

    val weightInKgs: Double
        get() = String.format("%.2f", weight / 2.2).toDouble()

    fun bark(): String {
        return if (weight < 20) "Yip!" else "Woof"
    }
}