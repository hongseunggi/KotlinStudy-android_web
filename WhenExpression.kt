fun main(args: Array<String>){
    val a2 = 1
    val list = listOf<String>("hello","world","hong")
    val array = arrayOf<String>("one","two","three")

    val data1 = "hello"
    val data2 = 15
    val data3 = "hong"
    val data4 = 3
    when(a2){
        1 -> println("a2 == 1")
        2 -> println("a2 == 2")
        else ->{
            println("a2 is neither 1 nor 2")
        }
    }
    when(data1){
        "hello" -> println("data1 is hello")
        "world" -> println("data1 is world")
        else -> {
            println("data1 is not hello or world")
        }
    }
    when(data2){
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1 <= data2 <= 10")
        in 11..20 -> println("11 <= data2 <= 20")
        else -> println("data2 > 20")
    }
    when(data3){
        in list -> println("data3 in list")
        in array -> println("data3 in array")
        else -> println("list and Array doesn't have data3")
    }
    val result2 = when(data4){ //Use when by expression
        1 -> "1...."
        2 -> "2...."
        else -> {
            println("else...")
            "hello" // this value for result2
        }
    }
    println("$result2") // print "hello"
}