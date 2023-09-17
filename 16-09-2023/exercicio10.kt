import java.util.*

/*
* Faça um programa na Linguagem Kotlin que receba um número e mostre o resto da divisão por 6.
*
* */

fun main(){
    val reader = Scanner(System.`in`)

    print("Número: ")
    val numero = reader.nextInt()
    val restoDivisao = numero % 6

    println("Resto de $numero dividido por 6: $restoDivisao")
}
