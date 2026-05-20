// high order functions
// Helps to perfom common task such as sorting, filtering
// Exampe of high order function, forEach(), map(), filter, groupBy, fold, sortedBy()

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
//using the forEach labda expression
    cookies.forEach{
        println("Menu item: ${it.name}")
    }
// maps used to transform data into a format we want
val fullMenu = cookies.map{
    "${it.name} - $${it.price}"
 }

// we have a list of string mapped with a map expression
// lets display it
println("The Full Menu is ------")
fullMenu.forEach{
	println(it)
}

// using filter
val softBakedMenu = cookies.filter{
	it.softBaked
}


println("Soft Baked -------")
softBakedMenu.forEach{
    println("${it.name} -- ${it.price}")
}


// using the groupBy
val groupedMenu = cookies.groupBy{
    it.softBaked
}
val softBakedMenu2 =groupedMenu[true]?:listOf()
println("Printing the items grouped by softBakedMenu")
softBakedMenu2.forEach{
    println("${it.name} -- $${it.price}")
}


// using folding
// mostly folding is used in summation of values
println("The total price of the cookies is: ")
val totalPrice = cookies.fold(0.0){total,cookie ->
	total + cookie.price
}
println("The total price of cookies is $${totalPrice}")


// using the folding
// mostly used to sort items
println("Printing the sorted cookies alfabeltically")
val sortedCookies = cookies.sortedBy{
	it.name	
}

sortedCookies.forEach{
	println(it.name)
}

}