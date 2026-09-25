fun main() {
    println("Enter numbers separated by space:")
    val numbers = readln().split(" ").map { it.toInt() }.toIntArray()

    println("Using for:")
    for (index in 1..numbers.size - 2) {
        if (numbers[index] > numbers[index - 1] && numbers[index] > numbers[index + 1]) {
            print("${numbers[index]} ")
        }
    }
    println()

    println("Using while:")
    var index = 1
    while (index < numbers.size - 1) {
        if (numbers[index] > numbers[index - 1] && numbers[index] > numbers[index + 1]) {
            print("${numbers[index]} ")
        }
        ++index
    }
    println()

    println("Using forEach:")
    numbers.withIndex().forEach { (index, value) ->
        if (index in 1..numbers.size - 2 &&
            value > numbers[index - 1] &&
            value > numbers[index + 1]
        ) {
            print("$value ")
        }
    }
    println()
}