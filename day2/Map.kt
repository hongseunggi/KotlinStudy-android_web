fun main(args: Array<String>){
    val immutableMap = mapOf<String, String>(Pair("one","hello"),Pair("two","World"))
    println("${immutableMap.get("one")},${immutableMap.get("two")}")
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("one","hello")
    mutableMap.put("two","Hong")
    println("${mutableMap.get("one")},${mutableMap.get("two")}")
}
