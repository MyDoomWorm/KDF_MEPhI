sealed class Transport(open val name: String) {
    abstract fun move()

    override fun toString(): String {
        return name
    }
}

class Car(name: String) : Transport(name) {
    override fun move() {
        println("$name is moving on the road.")
    }
}

class Bicycle(name: String) : Transport(name) {
    override fun move() {
        println("$name is pedaling on the bike path.")
    }
}

class Scooter(name: String) : Transport(name) {
    override fun move() {
        println("$name is knocks down passers-by.")
    }
}

class Boat(name: String) : Transport(name) {
    override fun move() {
        println("$name is sailing on the water.")
    }
}

class Plane(name: String) : Transport(name) {
    override fun move() {
        println("$name is flying in the sky.")
    }
}

fun main() {
    val car = Car("Toyota")
    val bicycle = Bicycle("Mountain Bike")
    val scooter = Scooter("Whoosh")
    val boat = Boat("Sailboat")
    val plane = Plane("Boeing 737 Max")

    val transports = listOf(car, bicycle, scooter, boat, plane)

    for (transport in transports) {
        transport.move()
    }
}
