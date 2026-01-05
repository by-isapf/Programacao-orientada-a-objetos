import java.util.Scanner;

public class questao24{

    public static String VERIFICA(int n) {
        if (n % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }

    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = coelhinho.nextInt();

        String resultado = VERIFICA(numero);

        System.out.println("O número " + numero + " é " + resultado + ".");

        coelhinho.close();
    }
}
