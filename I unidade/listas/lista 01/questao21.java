import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int num;

        System.out.println("Informe um numero:");
        num = coelhinho.nextInt();

        if (num>=1) {
            System.out.println("Este numero e positivo");
        } else {
            System.out.println("Este numero e negativo");
        }

        coelhinho.close();
    }
}
