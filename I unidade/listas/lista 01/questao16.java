import java.util.Scanner;

    public class questao16 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int num1, num2;

        System.out.println("Informe o primeiro numero:");
        num1 = coelhinho.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = coelhinho.nextInt();

        if (num1>num2) {
            System.out.println("O maior numero e:" +num1);
            System.out.println("O menor numero e: " +num2);
        } else if (num2>num1) {
            System.out.println("O maior numero e:" +num2);
            System.out.println("O menor numero e: " +num1);
        } else {
            System.out.println("Os numeros sao iguais");
        }

        coelhinho.close();

    }
}
