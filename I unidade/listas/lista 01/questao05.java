import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        double distancia, tempo, velocidade, litros; 

        System.out.println("Informe o tempo gasto na viagem:");
        tempo = coelhinho.nextDouble();

        System.out.println("Informe a velocidade media usada:");
        velocidade = coelhinho.nextDouble();

        distancia = tempo * velocidade;
        litros = distancia / 12 ;

        System.out.println("\n--- Resultados ---");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Velocidade media: " + velocidade + " km/h");
        System.out.println("Distancia percorrida: " + distancia + " km");
        System.out.println("Litros de combustivel utilizados: " + litros);

        coelhinho.close();
    }
}
