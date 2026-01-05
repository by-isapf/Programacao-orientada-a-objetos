import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int n = coelhinho.nextInt();

        System.out.println("\nTabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        coelhinho.close();
    }
}

