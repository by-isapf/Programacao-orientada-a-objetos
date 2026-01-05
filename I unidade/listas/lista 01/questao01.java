import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int quantidade_minima, quantidade_maxima; 
        double estoque;

        System.out.println("Digite a quantidade minima");
        quantidade_minima = coelhinho.nextInt();

        System.out.println("Digite a quantidade maxima");
        quantidade_maxima = coelhinho.nextInt();

        estoque = (quantidade_minima + quantidade_maxima)/2;

        System.err.println("O estoque medio e:" + estoque);

        coelhinho.close();
        
        
    }
}