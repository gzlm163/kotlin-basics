fun main() {
    var count = 0
    var sum = 0

    println("Enter numbers (0 to stop):")

    while (true) {
        val input = readln().toInt()
        if (input == 0) {
            break
        }
        ++count
        sum += input
    }

    val average = if (count > 0) {
        sum.toDouble() / count
    } else {
        0.0
    }

    println("Count: $count\nSum: $sum\nAverage: $average")
}

