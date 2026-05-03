fun main() {
    val number = 3
    when (number){
        // simple way to check for multiple values using "," operator
        2,3,5,7 -> println("The number is a prime number")
        else -> println("The number is not a prime number")
    }
}