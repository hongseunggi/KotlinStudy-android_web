package day4

class User{
    var data : String
    var data2 : Int
    val name1 : String = "Hong"
    var name2 : String? = null
    var name3 : String? = null
    var age : Int? = null
    init {
        data = "Hong"
        data2 = 25
    }
    constructor(name2: String, name3: String, age: Int){
        this.name2 = name2
        this.name3 = name3
        this.age = age
    }
}

fun main(args: Array<String>){
    val user = User("Seung","GI", 25)
    println("name : ${user.data}")
    println("age : ${user.data2}")
    println("name1 : ${user.name1}")
    println("name2 : ${user.name2}")
    println("name3 : ${user.name3}")
    println("age : ${user.age}")
}