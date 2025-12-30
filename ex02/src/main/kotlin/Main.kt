fun main(args: Array<String>) {

    // 1. Numbers
    // 1-1. Byte (타입 표기필수)
    var mByte: Byte = 100
    // 1-2. Short (타입 표기필수)
    var mShort: Short = 1000
    // 1-3. Integer (타입 추론가능)
    var mInt: Int = 10000
    // 1-4. Long (타입 추론가능)
    var mLong: Long = 100000000000L
    // 1-5. Float (타입 추론가능)
    var mFloat: Float = 1.5f
    // 1-6. Double (타입 추론가능)
    var mDouble: Double = 1.45254235

    // 2. Character (타입 추론가능)
    var mChar: Char = 'b'

    // 3. String (타입 추론가능)
    var mString: String = "Hello World"

    // 4. boolean (타입 추론가능)
    var mFalse: Boolean = false
    var mTrue: Boolean = true

    // 5. Arrays
    var mArray: Array<String> = arrayOf("Kotlin", "Is", "Fun")  // arrayOf() - 배열 생성 함수

    println(mArray[0])
    println(mArray.get(1))
    println(mArray.size)
}