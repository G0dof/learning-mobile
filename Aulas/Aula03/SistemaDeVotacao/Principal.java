package Aulas.Aula03.SistemaDeVotacao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaVotacao sistema = new SistemaVotacao();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Criar Partido: ");
            System.out.println("2. Criar Candidato: ");
            System.out.println("3. Votar: ");
            System.out.println("4. Exibir Resultados: ");
            System.out.println("5. Sair: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer do Scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do partido: ");
                    String nomePartido = sc.nextLine();
                    Partido partido = new Partido(nomePartido);
                    sistema.adicionarPartido(partido);
                    System.out.printf("Partido %s criado com sucesso\n", nomePartido);
                    break;
                case 2:
                    System.out.print("Digite o nome do candidato: ");
                    String nomeCandidato = sc.nextLine();
                    System.out.print("Digite o nome do partido do candidato: ");
                    String nomePartidoCandidato = sc.nextLine();
                    int numeroCandidato = sc.nextInt();
                    sc.nextLine();

                    Partido partidoCandidato = sistema.buscarPartidoPorNome(nomePartidoCandidato);
                    if (partidoCandidato != null) {
                        Candidato candidato = new Candidato(nomeCandidato, partidoCandidato, numeroCandidato);
                        sistema.adicionarCandidato(candidato);
                    } else System.out.println("Partido não encontrado. Crie o partido primeiro");
                    break;
                case 3:
                    System.out.print("Digite o número do candidato para votar: ");
                    int numeroVotoCandidato = sc.nextInt();
                    sistema.votar(numeroVotoCandidato);
                case 4:
                    sistema.exibirResultados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
