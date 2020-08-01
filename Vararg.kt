fun <T> varargsFun(a1: Int, vararg array: T){
    for(i in array){
        println(i)
    }
}
fun main(args: Array<String>){
    varargsFun(1, "hello","world")
    varargsFun(2, 10,false,true,"hello")
}