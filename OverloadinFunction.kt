fun some(a:String){
    println("some(a:String) Call")
}
fun some(a:Int){
    println("some(a:Int) Call")
}
fun some(a:Int, b:String){
    println("some(a:Int, b:String Call")
}
fun main(args: Array<String>){
    some("HELLOW")
    some(1)
    some(1,"helloworld")
}