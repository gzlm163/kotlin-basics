fun main() {
    println("Enter numbers separated by space:")
    val numbers = readln().split(" ").map { it.toInt() }.toIntArray()

    var productFor = 1
    var minFor = numbers[0]
    var maxFor = numbers[0]
    for (number in numbers) {
        productFor *= number
        if (number < minFor) {
            minFor = number
        }
        if (number > maxFor) {
            maxFor = number
        }
    }
    println("for: product=$productFor, min=$minFor, max=$maxFor")

    var productWhile = 1
    var minWhile = numbers[0]
    var maxWhile = numbers[0]
    var index = 0
    while (index < numbers.size) {
        productWhile *= numbers[index]
        if (numbers[index] < minWhile) {
            minWhile = numbers[index]
        }
        if (numbers[index] > maxWhile) {
            maxWhile = numbers[index]
        }
        ++index
    }
    println("while: product=$productWhile, min=$minWhile, max=$maxWhile")

    var productForEach = 1
    var minForEach = numbers[0]
    var maxForEach = numbers[0]
    numbers.forEach { number ->
        productForEach *= number
        if (number < minForEach) {
            minForEach = number
        }
        if (number > maxForEach) {
            maxForEach = number
        }
    }
    println("forEach: product=$productForEach, min=$minForEach, max=$maxForEach")

    println("reduce: product=${numbers.reduce { product, number -> product * number }}")
    println("min-max: min=${numbers.min()}, max=${numbers.max()}")
}