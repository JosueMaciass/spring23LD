// Josue Macias
// Feb 25 2023

fun main() {
    val names = arrayOf("", "", "")
    val times = arrayOf(0, 0, 0)

    for (i in 0 until 3) {
        println("Enter the name of runner ${i+1}: ")
        names[i] = readLine()!!

        println("Enter the time, in minutes, it took runner ${i+1} to finish the race: ")
        times[i] = readLine()!!.toInt()
    }

    val sortedTimes = times.copyOf().sorted()
    val sortedNames = Array(3) { "" }
    for (i in 0 until 3) {
        val index = times.indexOf(sortedTimes[i])
        sortedNames[i] = names[index]
    }

    println("The runners finished in the following order:")
    for (i in 0 until 3) {
        println("${i+1}. ${sortedNames[i]}")
    }
}