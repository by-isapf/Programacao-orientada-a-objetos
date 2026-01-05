package desafio2;

public class Boleto implements ProcessadorPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado. Aguardando pagamento.%n", valor);
        return true;
    }
}
