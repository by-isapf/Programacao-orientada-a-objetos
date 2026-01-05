import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite o 1º caractere: ");
        char c1 = coelhinho.next().charAt(0);

        System.out.print("Digite o 2º caractere: ");
        char c2 = coelhinho.next().charAt(0);

        if (c1 >= 'A' && c1 <= 'Z' && c2 >= 'A' && c2 <= 'Z' || 
            c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {

            if (c1 < c2) {
                int quantidade = (c2 - c1) - 1; 
                System.out.print("Resultado: " + c1 + " " + c2);
                System.out.println("  O número de caracteres entre eles é: " + quantidade);
            } else {
                System.out.println("Erro: os caracteres não foram digitados em ordem alfabética.");
            }

        } else {
            System.out.println("Erro");
        }

        coelhinho.close();
    }
}
