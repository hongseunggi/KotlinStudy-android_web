fun main(args: Array<String>){
    var sum : Int = 0
    val list = listOf<String>("Hello","World", "Hong")
    val sb = StringBuffer()
    var x = 0
    var sum1 = 0
    var x2 = 0
    var sum2 = 0
    for(i in 1..10){
        sum += i
    }
    println(sum)
    for(str in list){
        sb.append(str)
    }
    println(sb)
    for(i in list.indices){
        println(list[i])
    }
    for((index,value) in list.withIndex()){
        println("the element at $index is $value")
    }
    for(i in 1 until 11 step 2){
        println(i)
    }
    while(x<10){
        sum1 += ++x
    }
    println(sum1)
    while(true){
        sum2 += ++x2
        if(x2==10) break
    }
    println(sum2)
    for(i in 1..3){
        for(j in 1..3){
            println("i : $i, j : $j")
        }
    }
    for(i in 1..3){
        for(j in 1..3){
            if (j>1) break
            println("i : $i, j : $j")
        }
    }
    aaa@for(i in 1..3){
        for(j in 1..3){
            if(j>1) break@aaa //Break Use Label
            println("i : $i, j : $j")
        }
    }
}
