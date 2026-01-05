import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int num;
        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Digite números positivos (número negativo encerra):");

        while (true) {
            num = coelhinho.nextInt();

            if (num < 0) { // condição de parada
                break;
            }

            if (num % 2 == 0) {
                System.out.println(num + " é par.");
                somaPares += num;
            } else {
                System.out.println(num + " é ímpar.");
                somaImpares += num;
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        coelhinho.close();
    }
}

