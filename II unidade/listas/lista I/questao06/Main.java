package questao06;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MÍDIA GENÉRICA ===");
        Midia midia = new Midia("Documentário Era uma vez um crime", 2025, 90, 50.00);
        midia.exibirInfo();

        System.out.println("\n=== FILME ===");
        Filme filme = new Filme("Coraline", 2010, 148, 80.00, "Tim burton", "Fantasia");
        filme.exibirInfo();

        System.out.println("\n=== SÉRIE ===");
        Serie serie = new Serie("Game of thrones", 2010, 60, 100.00, 5, 13);
        serie.exibirInfo();
    }
}
