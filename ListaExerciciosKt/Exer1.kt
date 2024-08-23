fun main() {
    // 01 - Escreva um programa que converta um valor em dólares para reais.
    // Cotação do dia 22/08/2024 21:57

    print("Digite um valor em dólares: $")
    var dolar = (readLine()?.toDouble())?.times(5.59)
    println("O valor em reais é R$$dolar")

}