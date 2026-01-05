package questao01;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== VEÍCULO ===");
        Veiculo v1 = new Veiculo("Toyota", "Corolla", 2020, 100000);
        v1.exibirDetalhes();

        System.out.println("\n=== MOTO ===");
        Moto m1 = new Moto("Honda", "CB 500", 2022, 40000, 500);
        m1.exibirDetalhes();

        System.out.println("\n=== CAMINHÃO ===");
        Caminhao c1 = new Caminhao("Volvo", "FH 540", 2021, 600000, 25);
        c1.exibirDetalhes();
    }
}
