import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Forma> formas = new ArrayList<>();

        System.out.println("=== Sistema de Formas Geométricas ===");

        System.out.print("Quantas formas deseja cadastrar? ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nForma " + i + ":");
            System.out.print("Digite o tipo (retangulo/circulo): ");
            String tipo = sc.next().toLowerCase();

            switch (tipo) {
                case "retangulo":
                    System.out.print("Informe a largura: ");
                    double largura = sc.nextDouble();
                    System.out.print("Informe a altura: ");
                    double altura = sc.nextDouble();
                    formas.add(new Retangulo(largura, altura));
                    break;

                case "circulo":
                    System.out.print("Informe o raio: ");
                    double raio = sc.nextDouble();
                    formas.add(new Circulo(raio));
                    break;

                default:
                    System.out.println("Tipo de forma inválido! Ignorado.");
                    i--; 
                    break;
            }
        }

        System.out.println("\n=== Resultados das Formas ===");
        for (Forma f : formas) {
            f.exibirNome();
            System.out.printf("Área: %.2f%n", f.calcularArea());
            System.out.printf("Perímetro: %.2f%n", f.calcularPerimetro());
            System.out.println("-----------------------");
        }

        sc.close();
    }
}
