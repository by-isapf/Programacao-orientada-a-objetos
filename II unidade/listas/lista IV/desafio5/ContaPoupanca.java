package desafio5;

public class ContaPoupanca extends ContaBancaria {

    private final double taxaSaque = 1.0;

    public ContaPoupanca(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + taxaSaque;
        if (saldo >= total) {
            saldo -= total;
            adicionarAoHistorico("Saque: R$" + valor + " (Taxa: R$1.00)");
            return true;
        } else {
            return false;
        }
    }
}
