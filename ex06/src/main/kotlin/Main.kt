fun main(args: Array<String>) {

    // 1. if

//    val examResult = isPass(70)
//    println("ExamResult : $examResult")

//    val is3Contained = is3Contained(5..10)
//    println("is3Contained Result : $is3Contained")

    // 2. when
    // java의 switch문 대체
    // when (value) {
    //    조건1 -> 실행문
    //    조건2 -> 실행문
    //    else -> 기본 실행문
    //}

    val myGrade = getGrade(80)
    println("My grade : $myGrade")
}

fun isPass(examScore: Int): Boolean {
    if (examScore >= 60) {
        return true
    } else {
        return false
    }
}

fun is3Contained(intRange: IntRange): Boolean {
    if (intRange.contains(3)) {
        return true
    } else {
        return false
    }
}

fun getGrade(score: Int): Char {
    when (score) {
        in 0..40 -> return 'D'
        in 41..70 -> return 'C'
        in 71..90 -> return 'B'
        in 91..100 -> return 'A'
        else -> return 'Z'
    }
}