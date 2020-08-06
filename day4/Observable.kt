package day4

import kotlin.properties.Delegates

class User12{
    var name: String by Delegates.observable("nonValue",{props,old,new->
        println("old : $old ... new : $new")
    })
}
fun main(args: Array<String>){
    val user = User12()
    println(user.name)
    user.name = "Hong"
    user.name = "Seung"
    println(user.name)
}