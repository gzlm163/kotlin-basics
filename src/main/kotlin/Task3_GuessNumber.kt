fun main() {
    val target = (0..10).random()

    while (true) {
        print("Guess the number (0..10):")
        val guess = readln().toInt()

        if (guess > target) {
            println("Too much")
        } else if (guess < target) {
            println("Too little")
        } else {
            println("Guessed!")
            break
        }
    }
}

