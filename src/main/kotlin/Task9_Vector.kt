import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    fun dot(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    infix fun dotInfix(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    operator fun times(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    override fun toString(): String {
        return "Vector($x, $y, $z)"
    }
}

fun dotProduct(vector1: Vector, vector2: Vector): Double {
    return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z
}

fun main() {
    println("Enter coordinates of vector 1 (x y z):")
    val parts1 = readln().split(" ")
    val vector1 = Vector(parts1[0].toDouble(), parts1[1].toDouble(), parts1[2].toDouble())

    println("Enter coordinates of vector 2 (x y z):")
    val parts2 = readln().split(" ")
    val vector2 = Vector(parts2[0].toDouble(), parts2[1].toDouble(), parts2[2].toDouble())

    println("Length v1: ${vector1.length()}")
    println("Dot (method): ${vector1.dot(vector2)}")
    println("Dot (infix): ${vector1 dotInfix vector2}")
    println("Dot (operator *): ${vector1 * vector2}")
    println("Dot (outside function): ${dotProduct(vector1, vector2)}")
}