//Defining classes
class FillTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)


//Creating a generic class
data class Question<T> (
    val questionText: String,
    val answer: T,
    val difficulty: String
)


// defining a enum class
enum class DifficultyLevel {
    EASY,MEDIUM,HARD
}

fun main() {
    //Creating instances of the generic class
    val fillInTheBlank = Question<String>(
        questionText = "What is the capital of France?",
        answer = "Paris",
        difficulty = DifficultyLevel.HARD
    )

    val trueOrFalse = Question<Boolean>(
        questionText = "The Earth is flat.",
        answer = false,
        difficulty = DifficultyLevel.MEDIUM
    )

    val numericQuestion = Question<Int>(
        questionText = "What is 2 + 2?",
        answer = 4,
        difficulty = DifficultyLevel.EASY
    )
    // Defining objects
    object StudentProgress{
        val total: Int = 100
        val completed: Int = 3
    }

    
}