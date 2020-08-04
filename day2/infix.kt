infix fun Int.myFun(x: Int): Int{
    return x * x
}
class FunClass{
    infix fun infixFun(a: Int){
        println("infixFun call")
    }
}
fun main(args: Array<String>){
    val obj = FunClass()
    obj.infixFun(10)
    obj infixFun 10
    println(10 myFun 10)
    println(20.myFun(20))
}
