fun main() {
    print("Escreva uma distância, em metros: ")
    val metros = readlnOrNull()?.toDouble()
    val kilometros = metros?.div(1000)

    print("${metros}m em kilometros é igual a ${kilometros}km")
}