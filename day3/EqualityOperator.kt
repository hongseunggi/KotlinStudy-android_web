fun main(args: Array<String>){
    class User
    val user1 = User()
    val user2 = User()
    val user3 = user1
    val user4 = User()
    val user5: User? = user4
    val int1 = Integer(10)
    val int2 = Integer(10)
    val int3 = int1
    println("user1 == user2 ${user1 == user2}") // False.. because user1, user2 different object
    println("user1 === user2 ${user1 === user2}") // above reason
    println("user1 == user2 ${user1 == user3}")
    println("user1 === user3 ${user3 === user3}")
    println("user4 == user5 ${user4 == user5}")
    println("user4 === user5 ${user4 === user5}")
    println("int1 == int2 ${int1 == int2}") // True.. becasue int1 int2 different object but have same value
    println("int1 === int2 ${int1 === int2}")// False.. becasue they are different object
    println("int1 == int3 ${int1 == int3}")
    println("int1 === int3 ${int1 === int3}")
}
