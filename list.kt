fun main(args: Array<String>){
    val immutableList: List<String> = listOf("hello", "World")
    println("${immutableList.get(0)},${immutableList.get(1)}")
    val mutableList: MutableList<String> = mutableListOf("hello", "World")
    mutableList.set(1, "Korea")
    mutableList.add("Hong")
    println("${mutableList.get(0)},${mutableList.get(1)},${mutableList.get(2)}")
}