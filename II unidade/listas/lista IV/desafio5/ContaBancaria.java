package desafio5;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria implements Registravel {
    protected int numeroConta;
    protected double saldo;
    protected List<String> historico;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
    }

    @Override
    public void adicionarAoHistorico(String transacao) {
        historico.add(transacao);
    }

    public void depositar(double valor) {
        saldo += valor;
        adicionarAoHistorico("Depósito: R$" + valor);
    }

    public abstract boolean sacar(double valor);

    public void mostrarHistorico() {
        System.out.println("\nHistórico da conta " + numeroConta + ":");
        for (String t : historico) {
            System.out.println(t);
        }
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("-------------------------");
    }
}
