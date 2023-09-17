import java.util.*

/*
* . Faça um programa na Linguagem Kotlin que leia dois valores numéricos e apresentar a diferença do maior para o menor.
*
* */

fun main(){
    val reader = Scanner(System.`in`)

    print("Número 1: ")
    val numero1 = reader.nextInt()
    print("Número 2: ")
    val numero2 = reader.nextInt()

    val maiorNumero = if (numero1 > numero2) numero1 else numero2
    val menorNumero = if (numero1 < numero2) numero1 else numero2

    val diferenca = maiorNumero - menorNumero

    println("A diferença é $diferenca")
}