import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int a,b,c,d;

        System.out.print("Digite o valor de a: ");
        a = coelhinho.nextInt();

        System.out.print("Digite o valor de b: ");
        b = coelhinho.nextInt();

        System.out.print("Digite o valor de c: ");
        c = coelhinho.nextInt();

        System.out.print("Digite o valor de d: ");
        d = coelhinho.nextInt();

        System.out.println("\n--- Resultados da Adicao ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a + c = " + (a + c));
        System.out.println("a + d = " + (a + d));
        System.out.println("b + c = " + (b + c));
        System.out.println("b + d = " + (b + d));
        System.out.println("c + d = " + (c + d));

        System.out.println("\n--- Resultados da Multiplicacao ---");
        System.out.println("a * b = " + (a * b));
        System.out.println("a * c = " + (a * c));
        System.out.println("a * d = " + (a * d));
        System.out.println("b * c = " + (b * c));
        System.out.println("b * d = " + (b * d));
        System.out.println("c * d = " + (c * d));

        coelhinho.close();
    }
}
