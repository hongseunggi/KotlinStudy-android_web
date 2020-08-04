fun main(args: Array<String>){
    var array1 = arrayOf(10,"hong", false)
    var array2 = Array(3, {i -> i*10})
    var array3 = arrayOf<Int>(10,20,30)
    var array4 = IntArray(3,{i -> i*20})
    for(i in array1.indices){
        println(array1[i])
    }
    for(i in array2.indices){
        println(array2[i])
    }
    for(i in array3.indices){
        println(array3[i])
    }
    for(i in array4.indices){
        println(array4[i])
    }
}
