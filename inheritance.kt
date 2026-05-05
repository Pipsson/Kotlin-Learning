open class SmartDevice(val name: String, val category: String){
    var deviceStatus: String = "online"
    open fun turnOnDevice() {
		println("The device is turned on")
    }
    open fun turnOffDevice() {
        println("The device is turned off")
    }
}

// to create subclass
class SmartTvDevice (deviceName: String, deviceCategory : String) :  SmartDevice (deviceName ,deviceCategory) {
    
    // Defining a setlers
    var speakerVolume = 2
    set(value) {
        if(value in 1..100){
            field = value
        }
    }
    
    var channelNumber = 1
    set(value) {
        if (value in 1..200){
			field = value
        }
    }
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("The speaker volume is increased to $speakerVolume")
    }
    fun changeChannel() {
		channelNumber++
        println("Channel number is changed to $channelNumber")
    }
    
    override fun turnOnDevice() {
        deviceStatus = "on"
        speakerVolume = 2
        channelNumber = 1
        println("$name is turned on the speaker volume level is $speakerVolume")
    }
    
    override fun turnOffDevice() {
        deviceStatus = "off"
        speakerVolume = 0
        channelNumber = 1
        println("Device turned off")
    }
    
}

class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(
	deviceName,deviceCategory
){
    var brightnessLevel: Int = 0
    set(value){
        if(value in 1..100){
            field = value
        }
    }
    
    fun increaseBrightness() {
        brightnessLevel++ 
        println("The brightnes level increased to $brightnessLevel")
    }
    override fun turnOnDevice() {
        deviceStatus = "on"
        brightnessLevel = 2
        println("$name is turned on the brightness level is $brightnessLevel")
    }
    override fun turnOffDevice() {
		deviceStatus = "off"
        brightnessLevel = 0
        println("$name is turned of")
    }
    
}

class SmartHome(val smartTvDevice: SmartTvDevice, val smartLight: SmartLightDevice) {
    fun turnSmartTvOn(){
        smartTvDevice.turnOnDevice()
    }
    fun turnSmartLightOn(){
        smartLight.turnOnDevice()
	}
    fun adjustVolume() {
		smartTvDevice.increaseSpeakerVolume()
    }
    fun adjustChannel() {
       	smartTvDevice.changeChannel()
    }
    fun increaseSmartLightDeviceBrightness() {
        smartLight.increaseBrightness()
    }
    fun turnOffAllDevice() {
        smartLight.turnOffDevice()
        smartTvDevice.turnOffDevice()
    }
}

fun main() {
	val smartDevice: SmartDevice =  SmartTvDevice("Hisense 58'","Entertainment")
	smartDevice.turnOnDevice()
}


