/*
Faça um programa na Linguagem Kotlin que receba 2 números e apresente a multiplicação
dos dois números.
*/

import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)

    print("Número 1: ")
    val numero1 = reader.nextDouble()

    print("Número 2: ")
    val numero2 = reader.nextDouble()

    val multiplicacao = numero1 * numero2

    println("$numero1 x $numero2 = $multiplicacao")
}