fun main(args: Array<String>){
    val a = 5
    val result = if(a>10)"hello" else "world" //second execute
    val result2 = if(a<10) {
        println("hello") // first execute print
        10 + 20
    }else{
        println("world")
        20+20
    }
    val result3 = if(a>10) 20 else if(a>20) 30 else 10
    println("$result")
    println("$result2") // return 30
    println("$result3")

    if (a<10) println("$a < 10")
    if(a>0 && a<=10)
        println("0 < $a <= 10")
    else if(a > 10 && a <= 20)
        println("10<$a<=20")
    else
        println("$a > 20 ")
}
