fun main(args: Array<String>) {

    // 1. if

//    val examResult = isPass(70)
//    println("ExamResult : $examResult")

    val is3Contained = is3Contained(5..10)
    println("is3Contained Result : $is3Contained")
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