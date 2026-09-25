class NumberArray(private val numbers: IntArray) {

    fun sumPositive(): Int {
        var sum = 0
        for (number in numbers) {
            if (number > 0) {
                sum += number
            }
        }
        return sum
    }

    fun product(): Int {
        var product = 1
        for (number in numbers) {
            product *= number
        }
        return product
    }

    fun average(): Double {
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum.toDouble() / numbers.size
    }
}

fun main() {
    println("Enter numbers separated by space:")
    val numbers = readln().split(" ").map { it.toInt() }.toIntArray()

    val numberArray = NumberArray(numbers)

    println("Sum of positive: ${numberArray.sumPositive()}")
    println("Product: ${numberArray.product()}")
    println("Average: ${numberArray.average()}")
}