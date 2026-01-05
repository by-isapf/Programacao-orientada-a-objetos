import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite o tamanho dos vetores");
            n = coelhinho.nextInt();
        } while (n <= 0 || n > 50);

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        System.out.println("\nDigite os elementos do vetor V1:");
        for (int i = 0; i < n; i++) {
            System.out.print("V1[" + i + "] = ");
            v1[i] = coelhinho.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor V2:");
        for (int i = 0; i < n; i++) {
            System.out.print("V2[" + i + "] = ");
            v2[i] = coelhinho.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < n; i++) {
            if (v1[i] == v2[i]) {
                iguais++;
            }
        }

        System.out.println("\nQuantidade de posições com valores idênticos: " + iguais);

        coelhinho.close();
    }
}

