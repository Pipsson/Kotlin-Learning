fun main() {
    number = 4
    when (number){
        2,3,5,7 -> println("The number is a prime number")
        in 1..10 -> println("The number is between 1 and 10 but not a prime number")
        else -> println("The number is not a prime number")
    }
}