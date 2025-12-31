fun main(args: Array<String>) {
    // 객체 구현 없이 바로 사용
    println(MyFirstObject.number)
    MyFirstObject.sayHello()

    println(Dinner.MyCompanionObject.Menu)
    println(Dinner.eatDinner())
}

// object : 싱글톤 패턴으로 만들어지는 객체
object MyFirstObject {
    val number = 1
    fun sayHello() {
        println("Hello")
    }
}

// companion object : 클래스 내에 싱글톤 객체 구현
// static과 동일한 사용
// 한 클래스에 하나만 생성 가능
class Dinner {
    val lunch = "steak"
    companion object MyCompanionObject {
        val Menu = "pasta"
        fun eatDinner() {
            println("Today's Menu is $Menu")
        }
    }
}