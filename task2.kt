// Task one on the classes and collections
// Declaring a data class
data class Event (
	val eventTitle: String,
     //description might be null
    val eventDescription: String? = null,
    val eventDayPart: String,
    val eventDuration: Int
)
val studyKotlin = Event(
	eventTitle = "Study Kotlin",
    eventDescription =" Commit to studying Kotlin at least 15 minutes per day. ",
    eventDayPart = "Evenening",
    eventDuration = 30
    
)

// Task two refactoring the task 01 using the enum class to store the eventDayPart
//Creating an enum class
enum class EventDayPart {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    println(studyKotlin.eventTitle)
}