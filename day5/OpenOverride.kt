package day5

open class Shape2{
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

    open fun print(){
        println("name : $name location : $x, $y ")
    }
}

class Rect1 : Shape2(){
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
    override fun print(){
        println("name : $name location : $x, $y width : $width height : $height")
    }
}
class Circle1: Shape2(){
    var r: Int = 0
        set(value){
            if(value<0)field = 0
            else field = value
        }

    override fun print() {
        println("name : $name location : $x, $y radius : $r")
    }
}

fun main(args: Array<String>){
    val rect = Rect1()
    rect.name = "Rect"
    rect.x = 10
    rect.y = 10
    rect.width = 20
    rect.height = 20
    rect.print()

    val circle = Circle1()
    circle.name = "Circle"
    circle.x = 30
    circle.y = 30
    circle.r = 5
    circle.print()
}