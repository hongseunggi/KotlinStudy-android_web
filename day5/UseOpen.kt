package day5

open class Shape1{
    var x : Int = 0
        set(value){
            if(value<0)field = 0
            else field = value
        }
    var y : Int = 0
        set(value){
            if(value<0)field = 0
            else field = value
        }
    lateinit var name : String

    fun print(){
        println("name : $name location : $x, $y ")
    }
}

class Rect : Shape1(){
    var width : Int = 0
        set(value){
            if(value<0)field = 0
            else field = value
        }
    var height : Int = 0
        set(value){
            if(value<0)field = 0
            else field = value
        }

}
class Circle: Shape1(){
    var r: Int = 0
        set(value){
            if(value<0)field = 0
            else field = value
        }
}

fun main(args: Array<String>){
    val rect = Rect()
    rect.name = "Rect"
    rect.x = 10
    rect.y = 10
    rect.width = 20
    rect.height = 20
    rect.print()

    val circle = Circle()
    circle.name = "Circle"
    circle.x = 30
    circle.y = 30
    circle.r = 5
    circle.print()
}