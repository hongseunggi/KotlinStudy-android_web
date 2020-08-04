//val type is not Const... it just doing Read only Variable
var myBool = true
val myVal: String = "hello"
get(){
    if(myBool){
        return field
    }
    else{
        return field.toUpperCase()
    }
}
fun main(args: Array<String>){
    println(myVal)
    myBool = false
    print(myVal)
}
