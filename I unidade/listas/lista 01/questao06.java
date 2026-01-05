import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Informe a temperatura em graus celsius:");
        celsius = coelhinho.nextInt();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus fahrenheit e:" + fahrenheit);

        coelhinho.close();
    }
}