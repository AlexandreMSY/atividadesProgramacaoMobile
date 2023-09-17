/*
* . Faça um programa na Linguagem Kotlin que mostre a soma acumulada de números pares e a
média desses números, na faixa de 1 a 156.
* */

fun main(){
    var somaPares = 0

    for(num in 1..156){
        if(num % 2 == 0){
            somaPares += num
        }
    }

    val media = somaPares / 156

    println("Média dos números pares de 1 a 156: $media\nSoma dos valores: $somaPares")
}