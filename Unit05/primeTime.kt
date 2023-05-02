// Josue Macias
// 05/02/2023

// function to check if a number is divisible by another number
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}

fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    // loop through the numbers from 2 to the square root of the number
    // to check if there are any divisors
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }
    // if there are no divisors other than 1 and itself, the number is prime
    return true
}

fun main() {
    println(isPrime(6))     
    println(isPrime(13))    
    println(isPrime(8893))  
}