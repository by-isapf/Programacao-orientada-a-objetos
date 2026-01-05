import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int anos, meses, dias, idade_dias;

        System.out.println("Informe a sua idade em anos");
        anos = coelhinho.nextInt();

        System.out.println("Digite os meses tambem");
        meses = coelhinho.nextInt();

        System.out.println("E os dias tambem:");
        dias = coelhinho.nextInt();

        idade_dias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em dias e: " + idade_dias);

        coelhinho.close();
    }
}
