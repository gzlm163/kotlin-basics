open class Vehicle(open val speed: Int = 0, open val name: String = "Vehicle") {

    open fun start() {
        println("$name started moving at $speed km/h")
    }

    open fun stop() {
        println("$name stopped")
    }
}

class Boat(override val speed: Int = 25, override val name: String = "Boat") : Vehicle(speed, name) {

    override fun start() {
        println("$name started moving at $speed km/h")
    }

    override fun stop() {
        println("$name stopped")
    }
}

class Plane(override val speed: Int = 950, override val name: String = "Plane") : Vehicle(speed, name) {

    override fun start() {
        println("$name started moving at $speed km/h")
    }

    override fun stop() {
        println("$name stopped")
    }
}

class Tank(override val speed: Int = 60, override val name: String = "Tank") : Vehicle(speed, name) {

    override fun start() {
        println("$name started moving at $speed km/h")
    }

    override fun stop() {
        println("$name stopped")
    }
}

fun main() {
    val boat = Boat()
    val plane = Plane()
    val tank = Tank()

    boat.start()
    boat.stop()

    plane.start()
    plane.stop()

    tank.start()
    tank.stop()
}