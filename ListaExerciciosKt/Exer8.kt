fun main() {
    // 08 - Escreva um programa que inverta um número fornecido pelo usuário.

    print("Escreva um número: ")
    val num = readlnOrNull()
    var reversedNum = num?.reversed()?.toInt()

    println("O número $num invertido é $reversedNum")
}