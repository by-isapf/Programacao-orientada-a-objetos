import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        String resposta;
        double indice;

        do {
            System.out.print("Digite o índice de poluição");
            indice = coelhinho.nextDouble();

            if (indice == 0.0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice aceitável.");
            } else if (indice >= 0.3 && indice < 0.4) {
                System.out.println("Indústrias do 1º grupo devem suspender suas atividades!");
            } else if (indice >= 0.4 && indice < 0.5) {
                System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades!");
            } else if (indice >= 0.5) {
                System.out.println("Todos os grupos devem suspender suas atividades!");
            } else {
                System.out.println("Índice inválido ou abaixo dos limites considerados.");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = coelhinho.next();

        } while (!resposta.equalsIgnoreCase("S"));

        coelhinho.close();
    }
}
