fun main(args: Array<String>) {
    // Nullable vs Non-Nullable(Default)

    var myName: String = "Rege"
    println(myName.reversed())

    // Nullable ? (세이프콜 연산자) - null이면 샐행하지 않고 null을 반환하는 연산자
    var nullableMyName: String? = null
//    println(nullableMyName.reversed())  // null일 수 있으므로 컴파일러에서 런타임 에러

    println(nullableMyName?.reversed())

    // ?: (엘비스 연산자) - 좌측값이 null이면 우측 값을 반환하는 연산자
    val rege = nullableMyName?.reversed() ?: "Anonymous"
    println("rege = $rege")

    // !! (확정 연산자) - null이 아님을 확정하고 null이면 NullPointerException 발생
    println(nullableMyName!!.reversed())
}