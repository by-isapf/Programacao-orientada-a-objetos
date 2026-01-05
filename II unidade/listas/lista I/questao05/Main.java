package questao05;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRODUTO ELETRÔNICO GENÉRICO ===");
        ProdutoEletronico produto = new ProdutoEletronico("apple", "iphone 14", 1200.00, "540");
        produto.exibirEspecificacoes();

        System.out.println("\n=== SMARTPHONE ===");
        Smartphone celular = new Smartphone("amazon", "kindle 10a geração", 5000.00, "300", 6.8, 5000);
        celular.exibirEspecificacoes();

        System.out.println("\n=== NOTEBOOK ===");
        Notebook notebook = new Notebook("lenovo", "lenovo corei7", 4800.00, "430", "Intel i7", 16);
        notebook.exibirEspecificacoes();
    }
}
