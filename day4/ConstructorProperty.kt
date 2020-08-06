package day4

class User2(var name: String){
    var myName: String = name
        get() = field.toUpperCase()
        set(value){
            field = "Hello"+value
        }
}
class User3(name: String){
    var name: String = name
        get() = field.toUpperCase()
        set(value){
            field = "Hello"+name
        }
}
fun main(args: Array<String>){
    val user2 = User2("Seung")
    val user3 = User3("Hong")
    user2.name = "Hong"
    user2.myName = "Gi"
    println("name : ${user2.name}")
    println("myName : ${user2.myName}")
    user3.name = "Seung"
    println("name : ${user3.name}")
}