package misc

class Rectangle(width: Int, height: Int) {
    var width = width
        set(value) {
            if (value > 0) field = value
        }

    var height = height
        set(value) {
            if (value > 0) field = value
        }

    val isSquare: Boolean
        get() = (width == height)

    val area: Int
        get() = width * height
}

fun main() {
    val rectangles = arrayOf(
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1)
    )

    for (x in rectangles.indices) {
        rectangles[x].width = (x + 1) * 3
        rectangles[x].height = x + 5

        println("${x + 1}. This rectangle has area ${rectangles[x].area}")
        println("It is ${if (rectangles[x].isSquare) "" else "not"} a square.\n")
    }
}