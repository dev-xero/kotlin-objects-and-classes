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