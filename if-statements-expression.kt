fun main() {
	val trafficLightColor = "Red"
    val message = 
    if (trafficLightColor == "Red") "Stop"
    else if (trafficLightColor == "Yellow") "Slow"
    else if (trafficLightColor == "Green") "Go"
    else "There is fault on the traffic lights"
    println(message)
}