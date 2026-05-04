fun main() {
    var favoriteActor: String? = "Michael Fassbender"
    //Accessing the value of a nullable variable
    println(favoriteActor?.length) // "

    //non null assertion operator
    println(favoriteActor!!.length) // This will throw a NullPointerException if favoriteActor is null
}