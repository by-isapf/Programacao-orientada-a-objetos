import java.util.Scanner;

public class questao05{
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja processar: ");
        int quantidade = coelhinho.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = coelhinho.nextInt();

            long fatorial = 1;
            for (int j = 1; j <= n; j++) {
                fatorial *= j;
            }

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

        coelhinho.close();
    }
}

