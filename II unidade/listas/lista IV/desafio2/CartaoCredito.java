package desafio2;

public class CartaoCredito implements ProcessadorPagamento {
    private double limite;

    public CartaoCredito(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean processar(double valor) {
        if (valor <= limite) {
            System.out.printf("Pagamento de R$ %.2f aprovado no Cartão de Crédito.%n", valor);
            limite -= valor;
            return true;
        } else {
            System.out.printf("Pagamento de R$ %.2f recusado! Limite insuficiente.%n", valor);
            return false;
        }
    }
}
