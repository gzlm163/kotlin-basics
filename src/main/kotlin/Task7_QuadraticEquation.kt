import kotlin.math.sqrt

fun square(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return square(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val disc = discriminant(a, b, c)

    if (disc > 0) {
        return 2
    }
    if (disc == 0.0) {
        return 1
    }
    return 0
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val disc = discriminant(a, b, c)

    if (rootsNumber(a, b, c) == 2) {
        val x1 = (-b + sqrt(disc)) / (2 * a)
        val x2 = (-b - sqrt(disc)) / (2 * a)
        println("Two roots: x1 = $x1, x2 = $x2")
    } else if (rootsNumber(a, b, c) == 1) {
        val x = -b / (2 * a)
        println("One root: x = $x")
    } else {
        println("No roots")
    }
}

fun main() {
    println("Enter a, b, c:")
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    quadraticRoot(a, b, c)
}

