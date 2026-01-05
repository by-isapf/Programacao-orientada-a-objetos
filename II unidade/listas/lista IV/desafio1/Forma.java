public abstract class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Forma: " + nome);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
