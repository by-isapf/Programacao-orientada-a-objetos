import java.util.Scanner;

public class questao23 {

    public static double REAJUSTE(double salario, double indice) {
        return salario + (salario * indice / 100);
    }

    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = coelhinho.nextDouble();

        System.out.print("Digite o índice de reajuste (%): ");
        double indice = coelhinho.nextDouble();

        double novo_salario = REAJUSTE(salario, indice);

        System.out.printf("Salário reajustado: R$ %.2f%n", novo_salario);

        coelhinho.close();
    }
}
