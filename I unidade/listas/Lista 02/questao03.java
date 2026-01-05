import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite sua altura:");
        double altura = coelhinho.nextDouble();

        System.out.print("Digite seu sexo (M para masculino / F para feminino): ");
        char sexo = coelhinho.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44;
            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido. Digite M ou F.");
        }

        coelhinho.close();
    }
}
