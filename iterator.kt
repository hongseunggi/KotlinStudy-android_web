fun main(args: Array<String>){
    val list1 = listOf<String>("hello","World")
    val iterator1 = list1.iterator()
    while(iterator1.hasNext()){
        println(iterator1.next())
    }
    val map = mapOf<String, String>("one" to "hello", "two" to "Hong")
    val iterator2 = map.iterator()
    while(iterator2.hasNext()) {
        val value = iterator2.next()
        println("${value.key}----${value.value}")
    }
}