fun main(args: Array<String>){
    fun trueFun(): Boolean{
        println("Call trueFun...")
        return true
    }
    fun falseFun(): Boolean{
        println("Call falseFun...")
        return false
    }
    println("trueFun() && trueFun()")
    trueFun() && trueFun() // Left function return true.. so execute left fun and right fun
    println("falseFun() && trueFun()")
    falseFun() && trueFun() // Left function return false.. so execute left fun
    println("falseFun() || trueFun()")
    falseFun() || trueFun() // Left function return false.. so exectue left fun and right fun
    println("trueFun() || trueFun()")
    trueFun() || trueFun() // Left function return true.. so exectue left fun
}