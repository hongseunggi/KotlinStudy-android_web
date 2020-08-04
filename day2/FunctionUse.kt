fun sum(a: Int, b: Int): Int{
    var sum = 0
    fun calSum(){
        for(i in a..b){
            println(i)
            sum += i
        }
    }
    calSum()
    return sum
}

fun main(args: Array<String>){
    val result = sum(1,10)
    println(result)
}
