package desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);
        Checkout checkout = new Checkout();

        CartaoCredito cartao = new CartaoCredito(1000);
        Pix pix = new Pix();
        Boleto boleto = new Boleto();

        System.out.println("=== Sistema de Pagamentos ===");

        while (true) {
            System.out.println("\nEscolha o método de pagamento:");
            System.out.println("1 - Cartão de Crédito");
            System.out.println("2 - PIX");
            System.out.println("3 - Boleto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = coelhinho.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            System.out.print("Informe o valor da compra: R$ ");
            double valor = coelhinho.nextDouble();

            switch (opcao) {
                case 1:
                    checkout.finalizarCompra(cartao, valor);
                    break;
                case 2:
                    checkout.finalizarCompra(pix, valor);
                    break;
                case 3:
                    checkout.finalizarCompra(boleto, valor);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        coelhinho.close();
    }
}
