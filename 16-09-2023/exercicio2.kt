import java.util.*

/*
Faça um programa na Linguagem Kotlin que leia uma temperatura em graus Celsius e
apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5,
sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
*/

fun main(){
    val reader = Scanner(System.`in`)

    print("Temperatura em °C: ")
    val celsius = reader.nextDouble()
    val fahrenheit = (9 * celsius + 160) / 5

    println("$celsius°C = $fahrenheit°F")
}