import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros positivos");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = coelhinho.nextInt();

            while (vetor[i] <= 0) { 
                System.out.print("Valor inválido");
                vetor[i] = coelhinho.nextInt();
            }
        }

        System.out.print("\nDigite o valor de X");
        int x = coelhinho.nextInt();
        while (x <= 0) {
            System.out.print("Valor inválido");
            x = coelhinho.nextInt();
        }

        int maiores = 0, menores = 0, iguais = 0;

        for (int i = 0; i < 10; i++) {
            if (vetor[i] > x) {
                maiores++;
            } else if (vetor[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);
        System.out.println("Iguais a X: " + iguais);

        coelhinho.close();
    }
}
