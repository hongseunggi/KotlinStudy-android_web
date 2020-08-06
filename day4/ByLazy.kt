package day4

val someData: String by lazy {
    println("i am someData lazy...")
    "hello"
}

class User11{
    val name: String by lazy {
        println("i am name lazy...")
        "Hong"
    }
    val age: Int by lazy {
        println("i am age lazy...")
        25
    }
    init{
        println("i am init...")
    }
    constructor(){
        println("i am constructor")
    }

}
fun main(args: Array<String>){
    val user11 = User11()
    println("name use before...")
    println("name : ${user11.name}")
    println("name use after...")
    println("age use before...")
    println("age : ${user11.age}")
    println("age use after...")
}