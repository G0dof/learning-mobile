fun main() {
    // 03 - Escreva um programa que determine se um número é positivo, negativo ou zero
    print("Digite um número: ")
    var num = readLine()?.toDouble()!!

    if(num > .0) println("O número $num é POSITIVO!")
    else if(num < .0) println("O número $num é NEGATIVO!")
    else println("O número $num é NEUTRO!")
}