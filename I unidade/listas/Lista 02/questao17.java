import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int n = coelhinho.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = coelhinho.nextInt();
        }

        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            System.out.print("y[" + i + "] = ");
            y[i] = coelhinho.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }

        System.out.println("\nO produto escalar dos vetores é: " + produtoEscalar);

        coelhinho.close();
    }
}
