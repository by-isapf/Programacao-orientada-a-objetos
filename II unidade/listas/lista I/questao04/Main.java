package questao04;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== IMÓVEL GENÉRICO ===");
        Imovel imovel = new Imovel("Rua das Rosas, 123", 120.0, 3, 400000.00);
        imovel.exibirCaracteristicas();

        System.out.println("\n=== APARTAMENTO ===");
        Apartamento ap = new Apartamento("Rua das Margaridas", 85.0, 2, 550000.00, 10, 800.00);
        ap.exibirCaracteristicas();

        System.out.println("\n=== CASA ===");
        Casa casa = new Casa("Rua dos Lírios, 45", 200.0, 4, 750000.00, 60.0, true);
        casa.exibirCaracteristicas();
    }
}
