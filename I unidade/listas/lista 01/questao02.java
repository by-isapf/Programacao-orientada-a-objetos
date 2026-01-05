import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        double cotacao_dolar, valor_dolar, valor_real, resultado; 

        System.out.println("Informe a cotacao do dolar");
        cotacao_dolar = coelhinho.nextInt();

        System.out.println("Informe o valor em dolar");
        valor_dolar = coelhinho.nextInt();

        System.out.println("Informe o valor em real");
        valor_real = coelhinho.nextInt();

        resultado = cotacao_dolar * valor_dolar * valor_real ;

        System.out.println("O valor em real e:" + resultado);

        coelhinho.close();

    }
}
