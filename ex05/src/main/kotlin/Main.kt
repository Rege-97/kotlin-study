fun main(args: Array<String>) {

    // Range Class (범위 클래스)
    // IntRange, LongRange, CharRange
    val numRange : IntRange = 1..5 // 숫자 중간에 ..으로 범위 표현(숫자 둘 모두 포함)

    println(numRange.contains(3))   // contains() - 포함 여부 확인 Boolean 반환
    println(numRange.contains(10))

    val charRange: CharRange = 'a'..'e'
    println(charRange.contains('z'))
    println(charRange.contains('a'))


}