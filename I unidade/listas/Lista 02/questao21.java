import java.util.Random;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);
        Random rand = new Random();

        int numero_sorteado = rand.nextInt(101); 
        int tentativa;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número sorteado");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = coelhinho.nextInt();
            tentativas++;

            if (tentativa < numero_sorteado) {
                System.out.println("O número sorteado é maior que " + tentativa);
            } else if (tentativa > numero_sorteado) {
                System.out.println("O número sorteado é menor que " + tentativa);
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }

        } while (tentativa != numero_sorteado);

        coelhinho.close();
    }
}
