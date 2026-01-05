import java.util.Scanner;

public class questao26{

    public static boolean equilatero(double a, double b, double c) {
        return (a == b && b == c);
    }

    public static boolean isosceles(double a, double b, double c) {
        return (a == b && b != c) || (a == c && b != c) || (b == c && a != b);
    }

    public static boolean escaleno(double a, double b, double c) {
        return (a != b && a != c && b != c);
    }

    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triângulo:");
        System.out.print("Lado 1: ");
        double lado1 = coelhinho.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = coelhinho.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = coelhinho.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (equilatero(lado1, lado2, lado3)) {
                System.out.println("O triângulo é equilatero.");
            } else if (isosceles(lado1, lado2, lado3)) {
                System.out.println("O triângulo é isoceles.");
            } else if (escaleno(lado1, lado2, lado3)) {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        coelhinho.close();
    }
}
