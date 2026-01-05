package questao07;

public class Carro extends Veiculo {

    public Carro(String cor) {
        super(cor);
        // Em uma classe abstrata, o construtor da superclasse precisa ser chamado para inicializar todos os campos que são obrigatórios, garantindo que o objeto fique consistente.
    }

    public void exibirInformacoes() {
        System.out.println("Carro de cor: " + cor);
    }
}
