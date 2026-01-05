import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = coelhinho.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = coelhinho.nextInt();
        }

        System.out.println("\nVetor na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        coelhinho.close();
    }
}

