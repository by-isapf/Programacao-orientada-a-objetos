import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int num;
        Integer a = null, b = null;

        System.out.println("Informe um numero:");
        num = coelhinho.nextInt();

        if (num>=1) {
            a = num;
        } else {
            b = num;
        }

        System.out.println("Numero armazenado: " + a);
        System.out.println("Numero armazenado: " + b);

        coelhinho.close();


    }
}
