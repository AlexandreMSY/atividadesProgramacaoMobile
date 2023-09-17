import java.util.*

/*
Faça um programa na Linguagem Kotlin que efetue a leitura de um número inteiro e
apresentar uma mensagem informando se o número é par ou ímpar.
*/
fun main() {
    val reader = Scanner(System.`in`)

    print("Número: ")
    val numero = reader.nextInt()

    if (numero % 2 == 0) {
        print("$numero é par")
    } else {
        print("$numero é ímpar")
    }
}

