fun main() {
    print("Digite sua idade: ")
    var idade = readlnOrNull()?.toInt()!!

    if (idade >= 18)
        println("Pode entrar")
    else println("Vaza!")
}