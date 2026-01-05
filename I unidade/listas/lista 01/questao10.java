import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int num1, num2;

        System.out.println("Informe o primeiro numero:");
        num1 = coelhinho.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = coelhinho.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " e igual a " + num2);
        } else {
            System.out.println(num1 + " e diferente de " + num2);
        }

        if (num1 > num2) {
            System.out.println(num1 + " e maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " e menor que " + num2);
        }

        if (num1 >= num2) {
            System.out.println(num1 + " e maior ou igual a " + num2);
        }

        if (num1 <= num2) {
            System.out.println(num1 + " e menor ou igual a " + num2);
        }

        coelhinho.close();
    }
}
