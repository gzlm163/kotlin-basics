fun main() {
    print("Enter count of primes:")
    val n = readln().toInt()

    var count = 0
    var number = 2

    while (count < n) {
        var isPrime = true
        var divisor = 2

        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                isPrime = false
                break
            }
            ++divisor
        }

        if (isPrime) {
            ++count
            println("$count-th prime: $number")
        }

        ++number
    }
}

