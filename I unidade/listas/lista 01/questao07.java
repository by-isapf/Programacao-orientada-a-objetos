import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Informe a temperatura em graus fahrenheit:");
        fahrenheit = coelhinho.nextInt();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em graus celsius e:" + celsius);

        coelhinho.close();
    }
}
