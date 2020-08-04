val topData1: Int = 10
val topData2: Int = 20

class User{
    val objData1: String = "Hello"
    val objData2: String = "world"
    fun some(){
        val localData1: Int
        val localData2: String

        localData1 = 40
        println(localData1)
        localData2 = "Hello"
        println(localData2)
        println(objData1+objData2)
        println("$topData1  $topData2")
    }
}
fun main(args: Array<String>){
    val user = User()
    user.some()
}
