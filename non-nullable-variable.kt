fun main ()
{
    var favoriteActor : String = "Michael Fassbender"
    favoriteActor = null // This will cause a compile-time error because favoriteActor is non-nullable

    // To make it nullable, you can declare it as follows:
    var favoriteActorNullable : String? = "Michael Fassbender"
    favoriteActorNullable = null // This is allowed because favoriteActorNullable is nullable
}