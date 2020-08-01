tailrec fun sum1(n : Int, result: Int = 0): Int{
    if(n<=0) return result
    else return sum1(n-1, n+result)
}
fun main(args: Array<String>){
    val result = sum1(10)
    println(result)
}