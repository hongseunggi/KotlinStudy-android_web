/*Use lateinit keyword
* 1. VAR property에서만 사용가능하다
* 2. 클래스 몸체에 선언한 property에만 사용 가능하고, 주 생성자에서는 사용 불가함
* 3. 사용자 정의 getter/setter를 사용하지 않은 property에만 사용 가능함
* 4. null 허용 property에서는 사용 불가
* 5. 기초 타입 property에서는 사용 불가*/
package day4

class User1{
    lateinit var lateData : String
}
fun main(args: Array<String>){
    val user = User1()
    user.lateData ="hELLO"
    println(user.lateData)
}