package animals

class Dog(val name: String, var weight: Int, breedParam: String) {
    val breed = breedParam.uppercase()
    var activities = arrayOf("walks")

    fun bark(): String {
        return if (weight < 20) "Yip!" else "Woof"
    }
}