import java.util.Scanner;

public class questao25 {

    static Scanner coelhinho = new Scanner(System.in);
    static int[] vetor;
    static int n;

    public static void carregar_vetor() {
        System.out.print("Digite o tamanho do vetor: ");
        n = coelhinho.nextInt();
        vetor = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            vetor[i] = coelhinho.nextInt();
        }
    }

    public static void listar_vetor() {
        if (vetor == null) {
            System.out.println("Vetor não carregado");
            return;
        }
        System.out.print("Vetor: ");
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void exibir_pares() {
        if (vetor == null) {
            System.out.println("Vetor não carregado");
            return;
        }
        System.out.print("Números pares: ");
        for (int v : vetor) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
    }

    public static void exibir_impares() {
        if (vetor == null) {
            System.out.println("Vetor não carregado!");
            return;
        }
        System.out.print("Números ímpares: ");
        for (int v : vetor) {
            if (v % 2 != 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
    }

    public static void pares_posicoes_impares() {
        if (vetor == null) {
            System.out.println("Vetor não carregado");
            return;
        }
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0 && vetor[i] % 2 == 0) {
                cont++;
            }
        }
        System.out.println("Quantidade de números pares em posições ímpares: " + cont);
    }

    public static void impares_posicoes_pares() {
        if (vetor == null) {
            System.out.println("Vetor não carregado");
            return;
        }
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0 && vetor[i] % 2 != 0) {
                cont++;
            }
        }
        System.out.println("Quantidade de números ímpares em posições pares: " + cont);
    }

    public void run() {
        int opcao;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares");
            System.out.println("4 - Exibir apenas os números ímpares");
            System.out.println("5 - Exibir a quantidade de números pares em posições ímpares");
            System.out.println("6 - Exibir a quantidade de números ímpares em posições pares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = coelhinho.nextInt();

            switch (opcao) {
                case 1:
                    carregar_vetor();
                    break;
                case 2:
                    listar_vetor();
                    break;
                case 3:
                    exibir_pares();
                    break;
                case 4:
                    exibir_impares();
                    break;
                case 5:
                    pares_posicoes_impares();
                    break;
                case 6:
                    impares_posicoes_pares();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
