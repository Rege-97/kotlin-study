fun main(args: Array<String>) {

    // Range Class (범위 클래스)
    // IntRange, LongRange, CharRange
    val numRange: IntRange = 1..5 // 숫자 중간에 ..으로 범위 표현(a..b - a <= .. <= b)

    println(numRange.contains(3))   // contains() - 포함 여부 확인 Boolean 반환
    println(numRange.contains(10))

    val charRange: CharRange = 'a'..'e'
    println(charRange.contains('z'))
    println(charRange.contains('a'))

    // 1. For
    // in 키워드를 사용하여 forEach문처럼 사용하거나 범위 클래스를 사용하여 조절
    for (i in 1..5) {   // 범위 클래스로 범위 지정
        println(i)
    }

    for (i in 1 until 10) { // until - 마지막 수 포함 안함 ( a until b - a <= .. < b)
        println(i)
    }

    for (i in 10 downTo 1) { // downTo - 수가 줄어드며 역순으로 ( a >= .. >= b)
        println(i)
    }

    for (i in 1..10 step 2) {   // step - 늘어나거나 줄어드는 숫자 설정
        println(i)
    }

}