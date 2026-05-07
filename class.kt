//Defining a class in koltin is using the class keyword followed by the name of the class and curly braces
//The class can have properties and functions defined inside it
//it using the pascal case convention for naming the class
class Person {
    //Properties of the class
    var name: String = ""
    var age: Int = 0    
    //Function of the class
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

//instantiating the object of the class

// val or var followeed by the name of the object and the class name with parentheses
// example
// immutable object of the class
//only variable declared with val can be immutable, it cannot be reassigned to another object but the properties of the object can be changed
//but class object declared with var can be mutable, it can be reassigned to another object and the properties of the object can also be changed
val person1 = Person()

// mutable object of the class
var person2 = Person()


//var person1 = Person()
            