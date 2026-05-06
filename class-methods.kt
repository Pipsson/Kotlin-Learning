class SmartDevice {
    fun turnOn() {
        println("Turning on the device.")
        // Calling the method of the class  inside the class
        turnOff()
    }

    fun turnOff() {
        println("Turning off the device.")
    }

}

fun main() {
    val device = SmartDevice()
    // Calling the methods of the class using the object outside the class
    device.turnOn()
    device.turnOff()
}