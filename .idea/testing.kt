
fun main() {

}

//Creating the Function to Print Hello, Kotlin!
open fun sayHello() {
    println("Hello, Kotlin!")
}

abstract class Workshop {
    val time : Int
    val subject : String

    fun isRunning() {
        println("The Workshop is Running from $time")
    }

    fun hasStarted() {
        println("The Workshop on Subject $subject has Started.")
    }
}

class Computerscience : Workshop() {
}