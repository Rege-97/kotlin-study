fun main(args: Array<String>) {
    val memo = Memo("Go to grocery", "Eggs, Milk, Pokr", false)

    println(memo.toString())
    println(memo.title)
    val memo2 = memo.copy(title = "Go to home")
    println(memo2.toString())
}

// 데이터 클래스 : 데이터 전달의 목적으로 만드는 클래스
// data 키워드를 클래스 앞에 붙여서 생성
// toString(), equals(), hashCode(), copy(), componentN() 등 포함
data class Memo(val title: String, val content: String, var isDone: Boolean)