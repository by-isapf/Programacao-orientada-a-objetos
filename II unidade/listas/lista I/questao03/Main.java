package questao03;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CURSO GENÉRICO ===");
        Curso curso1 = new Curso("Introdução à Programação Orientada a Objetos", 40, 500.00, "Básico");
        curso1.exibirInformacoes();

        System.out.println("\n=== CURSO PRESENCIAL ===");
        CursoPresencial presencial = new CursoPresencial("Banco de Dados", 60, 800.00, "Avançado", "UFERSA - PDF");
        presencial.exibirInformacoes();

        System.out.println("\n=== CURSO ONLINE ===");
        CursoOnline online = new CursoOnline("Algoritmos", 50, 600.00, "Intermediário", "Udemy");
        online.exibirInformacoes();
    }
}
