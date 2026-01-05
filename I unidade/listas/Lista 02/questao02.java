import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = coelhinho.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = coelhinho.nextInt();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Verificar se um dos números é múltiplo do outro");
            System.out.println("2 - Verificar se os dois números são pares");
            System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = coelhinho.nextInt();

            switch (opcao) {
                case 1:
                    if (num1 % num2 == 0 || num2 % num1 == 0) {
                        System.out.println("Um dos números é múltiplo do outro.");
                    } else {
                        System.out.println("Nenhum dos números é múltiplo do outro.");
                    }
                    break;
                case 2:
                    if (num1 % 2 == 0 && num2 % 2 == 0) {
                        System.out.println("Os dois números são pares.");
                    } else {
                        System.out.println("Pelo menos um dos números não é par.");
                    }
                    break;
                case 3:
                    double media = (num1 + num2) / 2.0;
                    if (media >= 7) {
                        System.out.println("A média é " + media + " (maior ou igual a 7).");
                    } else {
                        System.out.println("A média é " + media + " (menor que 7).");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        coelhinho.close();
    }
}
