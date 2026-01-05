import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {

        Scanner coelhinho = new Scanner(System.in);

        int num; 

        System.out.println("Informe um numero:");
        num = coelhinho.nextInt();

        if (num>=0 && num<=9) {
            System.out.println("Valor valido");
        } else {
            System.out.println("Erro");
        }

        coelhinho.close();
    }
}
