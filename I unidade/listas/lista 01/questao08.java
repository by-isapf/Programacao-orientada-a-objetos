import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        double volume, raio, altura;

        System.out.println("Informe o valor do raio da lata:");
        raio = coelhinho.nextDouble();

        System.out.println("Informe agora a altura da lata:");
        altura = coelhinho.nextDouble();

        volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata de oleo e:" + volume);

        coelhinho.close();
    }
}
