fun main() {
    // Assigning the function reference to a variable
    val trickFunction = trick
    // Calling the function through the variable
    val trickFunction = ::trick

    val treat: () -> Unit = {
        println("On treats!")
    }

    fun trickOrTreat(isTrick:Boolean): () -> Unit{
         if(isTrick) {
            return trick
         } 
         else treat
    }
}

fun trick() { 
    println("On treats!")
    treat() 
}