import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int[] valores = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite 10 valores inteiros e positivos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = coelhinho.nextInt();

            while (valores[i] <= 0) { 
                System.out.print("Valor inválido");
                valores[i] = coelhinho.nextInt();
            }

            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }

            soma += valores[i];
        }

        double media = soma / 10.0;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);

        coelhinho.close();
    }
}
