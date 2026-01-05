import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite um número maior que 0 e menor que 10: ");
        int num = coelhinho.nextInt();

        if (num <= 0 || num >= 10) {
            System.out.println("Número inválido! Deve estar entre 1 e 9.");
        } else {
            int contador = 0;
            int atual = num;
            int soma = 0;

            while (contador < 20) {
                if (atual % 2 != 0) { // se for ímpar
                    soma += (atual * atual); // soma dos quadrados
                    contador++;
                }
                atual++;
            }

            System.out.println("A soma dos quadrados dos 20 primeiros ímpares a partir de " + num + " é: " + soma);
        }

        coelhinho.close();
    }
}
