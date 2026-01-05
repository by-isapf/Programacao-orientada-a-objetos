package questao10;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TRANSPORTE GENÉRICO ===");
        Transporte transporte = new Transporte(4, 120, 15, 40000);
        transporte.exibirDados();
        System.out.println("Custo de viagem 150 km: R$ " + transporte.calcularCustoViagem(150));

        System.out.println("\n=== ÔNIBUS ===");
        Onibus onibus = new Onibus(50, 80, 5, 350000, 3);
        onibus.exibirDados();
        System.out.println("Custo de viagem 150 km: R$ " + onibus.calcularCustoViagem(150));

        System.out.println("\n=== METRÔ ===");
        Metro metro = new Metro(200, 100, 10, 1000000, true);
        metro.exibirDados();
        System.out.println("Custo de viagem 150 km: R$ " + metro.calcularCustoViagem(150));
    }
}
