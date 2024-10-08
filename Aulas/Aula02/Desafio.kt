package Aulas.Aula02

fun main() {

    var nomes = arrayOf(
            "Alexa Martins Almeida",
            "Pedro Silva Pereira",
            "Lucas Oliveira Souza",
            "Maria Santos Rodrigues",
            "Isabella Ferreira Lima",
            "João Pereira Ribeiro",
            "Gabriel Alves Cardoso",
            "Laura Gonçalves Santos",
            "André Fernandes Mendes",
            "Beatriz Costa Almeida",
            "Matheus Rodrigues Souza",
            "Ana Martins Silva",
            "Leonardo Ribeiro Oliveira",
            "Clara Almeida Pereira",
            "Enzo Cardoso Martins",
            "Luiza Silva Rodrigues",
            "Rafael Alves Pereira",
            "Gustavo Fernandes Santos",
            "Carolina Gonçalves Ferreira",
            "João Pereira Ribeiro",
            "Lucas Fernandes Lima",
            "Manuela Almeida Costa",
            "Miguel Lima Alves",
            "Sofia Martins Santos",
            "Davi Rodrigues Pereira"
    )
    val sexos = arrayOf(
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Masculino",
            "Feminino",
            "Masculino",
            "Feminino",
            "Masculino"
    )
    var idades = arrayOf(19, 65, 34, 72, 18, 28, 59, 44, 27, 76, 18, 18, 61, 22, 56, 32, 73, 18, 16, 67, 41, 70, 30, 57, 24)
    var salarios = arrayOf(
            2500,
            3200,
            1800,
            4200,
            2900,
            5500,
            3800,
            4700,
            2100,
            3600,
            2800,
            5000,
            3400,
            4400,
            2600,
            4000,
            3100,
            2300,
            4700,
            3300,
            2700,
            4900,
            3500,
            2000,
            4100
    )
    var cargos = arrayOf(
            "Gerente de Vendas",
            "Diretor",
            "Desenvolvedor de Software",
            "Assistente Administrativo",
            "Engenheiro de Projetos",
            "Designer Gráfico",
            "Contador Financeiro",
            "Especialista em Recursos Humanos",
            "Consultor de Negócios",
            "Enfermeiro(a) Clínico(a)",
            "Analista de Dados",
            "Coordenador de Logística",
            "Gerente de Operações",
            "Assistente de Atendimento ao Cliente",
            "Médico(a) Generalista",
            "Professor(a) de Inglês",
            "Analista de Finanças",
            "Arquiteto(a) de Interiores",
            "Analista de Suporte Técnico",
            "Jornalista Freelancer",
            "Diretor",
            "Técnico de Laboratório",
            "Consultor de Segurança Cibernética",
            "Engenheiro de Qualidade",
            "Diretor"
    )
    // Homem mais velho
    var olderMan = idades.get(0)
    var olderManName = ""
    for(i in 1..nomes.size-1) {
        if(sexos.get(i).equals("Masculino") && idades.get(i) > olderMan){
            olderMan = idades.get(i)
            olderManName = nomes.get(i)
        }
    }
    println("O homem mais velho se chama $olderManName e tem $olderMan")

    println("#############################################")
    // Mulher mais velha
    var olderWoman = idades.get(0)
    var olderWomanName = ""
    for(i in 1..nomes.size-1) {
        if(sexos.get(i).equals("Feminino") && idades.get(i) > olderWoman){
            olderWoman = idades.get(i)
            olderWomanName = nomes.get(i)
        }
    }
    println("A mulher mais velha se chama $olderWomanName e tem $olderWoman")

    println("#############################################")
    // Homem mais novo
    var newerMan = idades.get(0)
    var newerManName = ""
    for(i in 1..nomes.size-1) {
        if(sexos.get(i).equals("Masculino") && idades.get(i) < newerMan){
            newerMan = idades.get(i)
            newerManName = nomes.get(i)
        }
    }
    println("O homem mais novo se chama $newerManName e tem $newerMan")

    println("#############################################")
    // Mulher mais novo
    var newerWoman = idades.get(0)
    var newerWomanName = ""
    for(i in 1..nomes.size-1) {
        if(sexos.get(i).equals("Feminino") && idades.get(i) < newerWoman){
            newerWoman = idades.get(i)
            newerWomanName = nomes.get(i)
        }
    }
    println("A mulher mais novo se chama $newerWomanName e tem $newerWoman")

    println("#############################################")
    // Média de idade dos homens

    var averageMen: Double = 0.0;
    var countMen = 0
    for(i in 0..nomes.size-1) {
        if(sexos.get(i).equals("Masculino")){
            countMen++
            averageMen += idades.get(i)
        }
    }
    averageMen = averageMen/countMen

    println("A média de idade dos homens é: $averageMen")

    println("#############################################")
    // Média de idade das mulheres

    var averageWomen: Double = 0.0;
    var countWomen = 0
    for(i in 0..nomes.size-1) {
        if(sexos.get(i).equals("Feminino")){
            countWomen++
            averageWomen += idades.get(i)
        }
    }
    averageWomen = averageWomen/countWomen

    println("A média de idade dos homens é: $averageWomen")

    println("#############################################")
    // Média geral

    var average: Double = 0.0
    for(i in 0..nomes.size-1) average += idades.get(i)

    average = average/(idades.size)

    println("A média geral é: $average")

    println("#############################################")
    // Nome de pessoas com 18 anos

    for(i in 0..idades.size-1) {
        if(idades.get(i) == 18) {
            println("${nomes.get(i)} tem 18 anos")
        }
    }

    println("#############################################")
    // Nome de pessoas começando com a letra "A"

    var count18plus = 0
    for(i in 0..idades.size-1) {
        if(nomes.get(i).startsWith("A")) {
            println("${nomes.get(i)} começa com a letra 'A'")
        }
    }
}