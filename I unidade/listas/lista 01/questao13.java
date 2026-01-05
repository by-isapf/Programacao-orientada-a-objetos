import java.util.Arrays;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            numeros[i] = coelhinho.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Numeros em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("numeros em ordem decrescente:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        coelhinho.close();
    }
}

