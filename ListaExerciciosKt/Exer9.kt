fun main() {
    // 09 - Escreva um programa que calcule a mediana de uma lista de números fornecida pelo usuário.

    print("Quantos números deseja inserir na lista? ")
    val qtdNum = readln().toInt()
    var arr: Array<Double?> = arrayOfNulls(qtdNum)
    var mediana: Double = 0.0

    for (i in arr.indices) {
        print("Insira um valor: ")
        arr[i] = readln().toDouble()
    }
    arr.sort()

    if (arr.size % 2 != 0) mediana = arr[arr.size/2]!!
    else {
        val num1 = arr[arr.size/2]!!
        val num2 = arr[(arr.size/2)-1]!!
        mediana = (num1+num2)/2
    }

    println("A mediana dos valores [${arr.joinToString()}] é $mediana")
}