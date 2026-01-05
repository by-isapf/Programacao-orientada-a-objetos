package desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        CaixaDeSom caixa = new CaixaDeSom();
        Projetor projetor = new Projetor();
        SmartTV smartTV = new SmartTV();
        SalaDeMidia sala = new SalaDeMidia();

        System.out.println("=== 🎥 Sistema Interativo da Sala de Mídia ===");

        while (true) {
            System.out.println("\nEscolha o tipo de sessão:");
            System.out.println("1 - Tocar Música");
            System.out.println("2 - Tocar Vídeo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int tipo = coelhinho.nextInt();
            coelhinho.nextLine(); 

            if (tipo == 0) {
                System.out.println("Encerrando a sala de mídia...");
                break;
            }

            System.out.println("\nEscolha o dispositivo:");
            System.out.println("1 - Caixa de Som");
            System.out.println("2 - Projetor");
            System.out.println("3 - SmartTV");
            System.out.print("Opção: ");
            int dispositivo = coelhinho.nextInt();
            coelhinho.nextLine(); 

            switch (tipo) {
                case 1 -> { 
                    System.out.print("Digite o nome da música: ");
                    String faixa = coelhinho.nextLine();

                    switch (dispositivo) {
                        case 1 -> sala.iniciarSessaoDeMusica(caixa, faixa);
                        case 2 -> System.out.println("O projetor não toca música!");
                        case 3 -> sala.iniciarSessaoDeMusica(smartTV, faixa);
                        default -> System.out.println("Opção inválida!");
                    }
                }

                case 2 -> { 
                    System.out.print("Digite o nome do filme: ");
                    String filme = coelhinho.nextLine();

                    switch (dispositivo) {
                        case 1 -> System.out.println("A caixa de som não exibe vídeos!");
                        case 2 -> sala.iniciarSessaoDeFilme(projetor, filme);
                        case 3 -> sala.iniciarSessaoDeFilme(smartTV, filme);
                        default -> System.out.println("Opção inválida!");
                    }
                }

                default -> System.out.println("Opção inválida!");
            }
        }

        coelhinho.close();
    }
}
