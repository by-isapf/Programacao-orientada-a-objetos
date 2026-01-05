import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int num1, num2, diferenca;

        System.out.println("Informe o primeiro numero:");
        num1 = coelhinho.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = coelhinho.nextInt();

        if (num1>num2) {
            diferenca = num1 - num2;
        } else {
            diferenca = num2 - num1;
        }

        System.out.println("A diferenca entre os numeros e: " + diferenca);

        coelhinho.close();

    }
}
