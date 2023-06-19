package animals

class Dog(val name: String, var weight: Int, val breed: String) {
    fun bark(): String {
        return if (weight < 20) "Yip!" else "Woof"
    }
}