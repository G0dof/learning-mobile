fun main() {
    /* 07 - Escreva um programa que conte o número total de letras em uma string, além disso também exiba a quantidade de vogais e a quantidade de consoantes */

    print("Insira uma string: ")
    val stringValue = readlnOrNull()!!
    var consoantes = 0
    var vogais = 0

    stringValue.forEach { letra ->
        if (listOf("a", "e", "i", "o", "u").contains(letra.toString().lowercase()))
            vogais++
        else
            consoantes++
    }

    println("A string $stringValue possui ${stringValue.length} letras, $consoantes consoantes e $vogais vogais")

}