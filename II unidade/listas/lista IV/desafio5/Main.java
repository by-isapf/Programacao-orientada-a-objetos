package desafio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        ContaBancaria contaCorrente = new ContaCorrente(1001, 0);
        ContaBancaria contaPoupanca = new ContaPoupanca(2001, 0);

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        System.out.println("=== Sistema Interativo de Contas Bancárias ===");

        while (true) {
            System.out.println("\nEscolha a conta:");
            System.out.println("1 - Conta Corrente (1001)");
            System.out.println("2 - Conta Poupança (2001)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcaoConta = coelhinho.nextInt();

            if (opcaoConta == 0) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            ContaBancaria selecionada;
            if (opcaoConta == 1) selecionada = contaCorrente;
            else if (opcaoConta == 2) selecionada = contaPoupanca;
            else {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar histórico");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            int operacao = coelhinho.nextInt();

            switch (operacao) {
                case 1 -> {
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valor = coelhinho.nextDouble();
                    selecionada.depositar(valor);
                    System.out.println("Depósito realizado com sucesso!");
                }
                case 2 -> {
                    System.out.print("Digite o valor do saque: R$ ");
                    double valor = coelhinho.nextDouble();
                    boolean sucesso = selecionada.sacar(valor);
                    System.out.println(sucesso ? "Saque realizado com sucesso!" : "Saldo insuficiente!");
                }
                case 3 -> selecionada.mostrarHistorico();
                case 0 -> System.out.println("Voltando ao menu de contas...");
                default -> System.out.println("Opção inválida!");
            }
        }

        coelhinho.close();
    }
}
