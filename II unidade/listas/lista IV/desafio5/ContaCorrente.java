package desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            adicionarAoHistorico("Saque: R$" + valor);
            return true;
        } else {
            return false;
        }
    }
}
