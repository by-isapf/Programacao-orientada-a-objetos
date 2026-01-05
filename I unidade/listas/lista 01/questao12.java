import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {

        Scanner coelhinho = new Scanner(System.in);

        int num, modulo;

        System.out.println("Informe um numero:");
        num = coelhinho.nextInt();

        modulo = Math.abs(num);

        System.out.println("O modulo deste numero e:" + modulo);

        coelhinho.close();

    }
}
