import java.util.*
/*
Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Fahrenheit e
apresentá-la convertida em graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo
f a temperatura em Fahrenheit e C a temperatura em Celsius.
*/

fun main(){
    val reader = Scanner(System.`in`)

    print("Temperatura em °F: ")
    val fahrenheit = reader.nextDouble()
    val celsius = (fahrenheit - 32) * 5/9

    println("$fahrenheit°F = $celsius°C")
}
