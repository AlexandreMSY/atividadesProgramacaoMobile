import java.util.*

/*Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior deles.*/

fun main() {
    val reader = Scanner(System.`in`)

    print("Número 1: ")
    val numero1 = reader.nextInt()
    print("Número 2: ")
    val numero2 = reader.nextInt()
    print("Número 3: ")
    val numero3 = reader.nextInt()

    if (numero1 > numero2 && numero1 > numero3) {
        println("$numero1 é o maior")
    } else if (numero2 > numero1 && numero2 > numero3) {
        println("$numero2 é o maior")
    } else if (numero3 > numero1 && numero3 > numero2) {
        println("$numero3 é o maior")
    } else {
        println("Números iguais")
    }

}
