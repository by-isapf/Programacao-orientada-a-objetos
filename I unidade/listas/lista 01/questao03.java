import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int identificacao, codigo, quantidade; 
        double preco, comissao, total_venda; 

        System.out.println("Informe a identificacao do vendedor");
        identificacao = coelhinho.nextInt();

        System.out.println("Digite o codigo da peca:");
        codigo = coelhinho.nextInt();

        System.out.println("Digite o preco da peca");
        preco = coelhinho.nextDouble();

        System.out.println("Digite a quantidade vendida:");
        quantidade = coelhinho.nextInt();

        total_venda = preco * quantidade;
        comissao = total_venda * 0.05 ;

        System.out.println("\n--- Resultados ---");
        System.out.println("Identificação do vendedor: " + identificacao);
        System.out.println("Código da peça: " + codigo);
        System.out.println("Total da venda: R$ " + total_venda);
        System.out.println("Comissão do vendedor: R$ " + comissao);

        coelhinho.close();


    }
}
