package day3

class User{
    var name : String = "Hong"
        get() = field
        set(value) {field = value}

    val age : Int = 20
        get() = field
}
fun main(args: Array<String>){
    val user = User()
    user.name = "Seung" // this statement call setter... execute set(value) { field = value }
    println("name : ${user.name}")
    println("age : ${user.age}")
}