fun main() {
    print("Enter a positive integer: ")
    val input = readln()
    val number = input.toInt()

    val lastDigit = number % 10
    var firstDigit = number
    while (firstDigit >= 10) {
        firstDigit /= 10
    }

    val sum1 = firstDigit + lastDigit
    println("Method 1 (math): sum = $sum1")
    val sum2 = input.first().toString().toInt() + input.last().toString().toInt()
    println("Method 2 (string): sum = $sum2")
}

