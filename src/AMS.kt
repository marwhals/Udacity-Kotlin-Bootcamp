import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    dayOfWeek()
    feedTheFish()
}

fun dayOfWeek() {
    println("What day is it today?")
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    val x = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (x) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day : String) : String {
    return when(day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "Cake"
        else -> "stuff"
    }
}

