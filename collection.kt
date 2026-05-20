// Declaring the array in kotlin
//Array of strings
val rockPlanets = arrayOf<String>(
"Earth", "Saturn", "Jupiter", "Neptune"
)
val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

fun main() {
    //Joing the arrays
    val	solarSystem = rockPlanets + gasPlanets
//     modifying items on the aray
    solarSystem[3] = "Little Earth"
   
// solarSystem[9] = "Pluto"
// Accesing the array items using the subscript syntax
println(solarSystem[0])
println(solarSystem[1])
println(solarSystem[2])
println(solarSystem[3])
println(solarSystem[4])
println(solarSystem[5])
println(solarSystem[6])
println(solarSystem[7])
    
    // This kind of list isnot mutable
    //One of the key characteristics of the list is, items of list are arranged on the order
   
    val planetList = listOf("Mercury","Venus","Mars","Jupiter")
    // The kind of list which is mutable is using mutableList instead of listOf
    val planetList2 = mutableListOf("Mercury","Mars","Earth","Jupiter","Saturn")
    // to add item on the list without considering the position of added item
    planetList2.add("New planet")
    // considering the index
    planetList2.add(0,"old planet")
    
    //Sets
    //searching items on the sets is more faster compared to list
    //sets items are not arranged on the order
    //sets tends to utilize more memory compared to array
    //Sets contains unique items compared to list contains repeated items
    //Sets is same as list, sets also have mutableSet and Set
    
    // Declaring mutableSet
    val discoveredPlanets = mutableSetOf("planet1","planet2","planet3")
    // Checking the item
    println(discoveredPlanets.contains("planet1"))
    //printing the size
    println(discoveredPlanets.size)
    // Removing the items
    println(discoveredPlanets.remove("planet1"))
    // remove at a specific
//     println(discoveredPlanets.removeAt(2))
    
//Map Collection
// 	contains unique keys
// Also have mapOf and mutableMapOf
// declaring a map 
 val planetStars = mapOf(
 	"Mercury" to 1,
     "Earth"  to 2
  )
 // checking the size of the map
 println("The size of the map is ${planetStars.size}")
//  checking the size
println(planetStars.size)
    
// println("The following is size of planet list ${planetList.size}")
// acessing item on the list 
	println(planetList.get(3))
    // iterating items on list
    println("Platnet list before adding")
    for (planet in planetList){
		println(planet)
    }
    println("Platnet list after adding")
    for (planet in planetList2){ 
		println(planet)
    }
    
// 
}