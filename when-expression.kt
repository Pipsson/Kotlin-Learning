fun main() {
    val trafficLightColor = "v"
    val message = when(trafficLightColor) {
        "Red" -> "Stops"
        "Yellow", "Amber" -> "Slow down"
        "Green" -> "Go"
        else -> "Invalid traffic light color"
    }
    println(message)
}
