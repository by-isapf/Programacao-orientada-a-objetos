package desafio2;

public class Checkout {
    public void finalizarCompra(ProcessadorPagamento metodo, double valorTotal) {
        System.out.println("\n--- Iniciando pagamento de R$ " + String.format("%.2f", valorTotal) + " ---");

        boolean sucesso = metodo.processar(valorTotal);

        if (sucesso) {
            System.out.println("Transação concluída com sucesso!");
        } else {
            System.out.println("Falha na transação. Tente outro método de pagamento.");
        }
    }
}

