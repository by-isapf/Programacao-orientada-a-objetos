import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int num;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite um número ");

        while (true) {
            num = coelhinho.nextInt();

            if (num < 0) { 
                break;
            }

            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi informado.");
        } else {
            System.out.println("\nMenor número: " + menor);
            System.out.println("Maior número: " + maior);
        }

        coelhinho.close();
    }
}
