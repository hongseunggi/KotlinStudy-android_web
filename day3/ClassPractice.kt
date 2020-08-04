class MyClass1{
    var name : String = "Hong"
    fun sayhello(){
        println("hello $name")
    }
}
class User1(name: String, age: Int){
    init{
        println("$name, $age")
    }
    val name : String = name
    val age : Int = age
}
class User2(name: String){
    init{
        println("init block...$name")
    }
    constructor(name: String, age: Int): this(name){
        println("Constructor block... $name, $age")
    }
}
class User3(name: String){
    init{
        println("init block...$name")
    }
    constructor(name: String, age: Int): this(name){
        println("Constructor1 block...$name, $age")
    }
    constructor(name: String, age: Int, email: String):this(name,age){
        println("Constructor2 block...$name, $age, $email")
    }
}
fun main(args: Array<String>){
    val obj1 = MyClass1()
    val obj2 = MyClass1()
    val obj3 = User1("Hong", 33)
    val obj4 = User1("Seung",25)
    obj1.name = "Seung"
    obj2.name = "Gi"
    obj1.sayhello()
    obj2.sayhello()
    println("${obj3.name}, ${obj3.age}")
    println("${obj4.name}, ${obj4.age}")
    println("주 생성자")
    val obj5 = User2("Hong")
    println("보조 생성자")
    val obj6 = User2("Hong",25)
    println("주 생성자")
    val obj7 = User3("Hong")
    println("보조 생성자 1")
    val obj8 = User3("Hong",25)
    println("보조 생성자 2")
    val obj9 = User3("Hong",25, "tmdrl5661@gmail.com")
}
