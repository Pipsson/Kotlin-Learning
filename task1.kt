// Task one on the classes and collections
// Declaring a data class and creating an instance of it. Then printing the title of the event to the console.
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

fun main() {
    println(studyKotlin.eventTitle)
}