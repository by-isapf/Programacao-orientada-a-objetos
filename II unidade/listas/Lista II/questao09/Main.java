package questao09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        ProdutoAlimenticio produto = new ProdutoAlimenticio(10);

        System.out.println("Digite a quantidade solicitada:");
        int quantidade = coelhinho.nextInt();

        produto.verificarDisponibilidade(quantidade);

        coelhinho.close();
    }
}

