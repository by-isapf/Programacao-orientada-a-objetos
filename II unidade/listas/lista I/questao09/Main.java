package questao09;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LIVRO GENÉRICO ===");
        Livro livro = new Livro("Drácula", "Bran Stoker", 1890, 45.00);
        livro.exibirFichaCatalografica();
        System.out.println("Multa por 3 dias de atraso: R$ " + livro.calcularMultaAtraso(3));

        System.out.println("\n=== LIVRO DIDÁTICO ===");
        LivroDidatico didatico = new LivroDidatico("Matemática Básica", "Prof. Ana Silva", 2020, 80.00, "Matemática");
        didatico.exibirFichaCatalografica();
        System.out.println("Multa por 3 dias de atraso: R$ " + didatico.calcularMultaAtraso(3));

        System.out.println("\n=== LIVRO RARO ===");
        LivroRaro raro = new LivroRaro("Edição 3D de O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 500.00, true);
        raro.exibirFichaCatalografica();
        System.out.println("Multa por 3 dias de atraso: R$ " + raro.calcularMultaAtraso(3));
    }
}
