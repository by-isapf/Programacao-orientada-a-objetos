import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int a,b,c;

        System.out.println("Informe o primeiro valor:");
        a = coelhinho.nextInt();
        System.out.println("Informe o segundo valor:");
        b = coelhinho.nextInt();
        System.out.println("Informe o terceiro valor:");
        c = coelhinho.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triangulo equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triangulo isoceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("Esses valores nao formam um triangulo");
        }

        coelhinho.close();

    }
}
