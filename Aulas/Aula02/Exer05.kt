package Aulas.Aula02

fun main() {
    print("Digite a nota do aluno: ")
    var nota = readlnOrNull()?.toInt()

    when(nota) {
        10,9,8 -> println("Parabéns, você é um ótimo aluno!")
        7,6 -> println("Você é bem medíocre, parabéns!")
        5,4,3 -> println("Vai ficar de exame!")
        2,1,0 -> println("Foi de arrasta!!!!!!!!")
        else -> println("Nota inválida!")
    }
}