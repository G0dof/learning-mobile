fun main() {
    val x = "correto"

    var elvisOperator = retornaNull(x) ?: "Valor DEFAULT"
    print(elvisOperator)
}

fun retornaNull(a: String): String? {
    if (a.equals("correto")) {
        return "Deu bom"
    }
    return null
}