import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int num1, num2, temporaria; 

        System.out.println("Informe o primeiro valor:");
        num1 = coelhinho.nextInt();

        System.out.println("Informe o segundo valor:");
        num2 = coelhinho.nextInt();

        System.out.println("Valores antes da troca:");
        System.out.println("valor 1:" + num1);
        System.out.println("Valor 2:" + num2);
        
        temporaria = num1;
        num1 = num2;
        num2 = temporaria; 

        System.out.println("Valores depois da troca:");
        System.out.println("Valor 1: " + num1);
        System.out.println("Valor 2:" + num2);

        coelhinho.close();

    }
}
