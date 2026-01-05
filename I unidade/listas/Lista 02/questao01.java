import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = coelhinho.nextInt();

        System.out.print("Digite o primeiro numero: ");
        double num1 = coelhinho.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = coelhinho.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisao por zero nao e permitida.");
                }
                break;
            default:
                System.out.println("Opçcao invalida.");
        }

        coelhinho.close();
    }
}
