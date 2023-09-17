import java.util.*

/*
* Faça um programa na Linguagem Kotlin que efetue a leitura de um valor inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.
*
* */

fun main(){
    val reader = Scanner(System.`in`)

    print("Número: ")
    val numero = reader.nextInt()

    if(numero > 3){
        print("Valor maior que 3")
    }else{
        print("Valor inserido: $numero")
    }
}