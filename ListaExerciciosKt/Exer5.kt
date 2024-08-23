fun main() {
    // 05 - Escreva um programa que verifique se um número é palíndromo.

    print("Escreva uma palavra ou frase: ")
    val texto = readlnOrNull()

    if(texto?.replace(" ", "").equals(texto?.replace(" ", "")?.reversed()))
        println("A palavra $texto é um PALÍNDROMO")
    else
        println("A palavra $texto NÃO é um PALÍNDROMO")
    print(texto?.replace(" ", ""))
}