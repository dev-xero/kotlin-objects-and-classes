package misc

class Car(val make: String, val model: String) {
    fun accelerate() = println("accelerating...")
    fun applyBrake() = println("applied brakes.")
    fun changeTemperature() = println("changing temperature...")
}

fun main() {
    val aston = Car("aston martin", "477")

    aston.run {
        println("That there is an $make model $model\n")
    }

    aston.accelerate()
    aston.applyBrake()
    aston.changeTemperature()
}