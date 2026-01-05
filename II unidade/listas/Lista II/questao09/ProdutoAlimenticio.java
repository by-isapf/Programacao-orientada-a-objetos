package questao09;

public class ProdutoAlimenticio extends Produto {

    public ProdutoAlimenticio(int quantidadeEstoque) {
        super(quantidadeEstoque);
    }

    @Override
    public void verificarDisponibilidade(int quantidadeSolicitada) {
        if (quantidadeSolicitada > quantidadeEstoque) {
            System.out.println("Estoque Insuficiente!");
        } else if (quantidadeSolicitada == quantidadeEstoque) {
            System.out.println("Últimas Unidades!");
        } else {
            System.out.println("Disponibilidade OK.");
        }
    }
}
