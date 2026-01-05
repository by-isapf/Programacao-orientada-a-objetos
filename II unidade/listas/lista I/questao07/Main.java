package questao07;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ESPORTE GENÉRICO ===");
        Esporte esporte = new Esporte("Tênis", 2, 90, 70);
        esporte.exibirRegras();

        System.out.println("\n=== FUTEBOL ===");
        Futebol futebol = new Futebol("Futebol", 11, 90, 95, 105);
        futebol.exibirRegras();

        System.out.println("\n=== BASQUETE ===");
        Basquete basquete = new Basquete("Basquete", 5, 48, 85, 3.05);
        basquete.exibirRegras();
    }
}
