fun main() {
    // 04 - Escreva um programa que some os dígitos de um número.
    print("Digite um número inteiro: ")
    val numbers = readlnOrNull().toString()
    var soma = 0

    for(number in numbers.toString().split("").filter { it.isNotBlank() })
        soma += number.toInt()


    println("A soma dos algarismos do número $numbers é $soma")
}