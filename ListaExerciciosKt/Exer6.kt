fun main() {
    // 06 - Escreva um programa que concatene duas strings fornecidas pelo usuário

    print("Escreva palavra ou frase: ")
    val string1 = readLine()
    print("Escreva outra palavra ou frase: ")
    val string2 = readLine()

    val stringConcat = string1 +string2

    println("A palavra $string1 e $string2 concatenadas resultam em: $stringConcat")
}