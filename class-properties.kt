class SmartDevice  {
    //Defining the class variables 
    val deviceName: String = "Android Tv"
    var status: String = "Online"
    val category: String = "Entertainment"

    fun turnOn() {
        println("$deviceName is now ON.")
    }

    fun turnOff() {
        println("$deviceName is now OFF.")
    }

}

fun main() {
    // Accessing the properties of the class using the object of the class
    val myDevice = SmartDevice()
    println("Device Name: ${myDevice.deviceName}")
    println("Status: ${myDevice.status}")
    println("Category: ${myDevice.category}")

    myDevice.turnOn()
    myDevice.turnOff()
}