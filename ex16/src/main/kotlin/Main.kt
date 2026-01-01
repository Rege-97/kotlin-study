fun main(args: Array<String>) {
    // lateinit, lazy
    // 변수와 상수의 늦은 초기화
    // 선언만 하고 나중에 값을 넣을 때 사용

    var name= "Rege"

    // lateinit -> var
    // 초기화 전에 사용하면 에러 발생
    // nullable과 함께 사용 불가
    // 원시 자료형에는 사용 불가
    lateinit var lunch : String
    lunch = "waffle"

    println(lunch)

    // lazy -> val
    // 객체가 생성될 때 초기화 되는것이 아닌 처음 호출될 때 by lazy{} 안의 코드가 실행되면서 초기화
    val lazyBear : String by lazy {
        println("Bear is coming!")
        "bear"
    }

    println("First try :::")
    println(lazyBear)
    println("Second try:::")
    println(lazyBear)
}