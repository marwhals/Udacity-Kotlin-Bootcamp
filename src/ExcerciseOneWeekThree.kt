import java.util.*

//One liner println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")

fun main(args: Array<String>) {
    val x = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    val z = if(x < 12) {
        "Good morning"
    } else {
        "Good evening"
    }

    println(z)
}
