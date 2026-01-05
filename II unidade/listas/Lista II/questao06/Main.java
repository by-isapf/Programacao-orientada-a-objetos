package questao06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Scanner coelhinho = new Scanner(System.in);

        System.out.println("Digite a mensagem de log para arquivo:");
        String logArquivo = coelhinho.nextLine();
        logger.salvarLocal(logArquivo);

        System.out.println("-------------------");

        System.out.println("Digite a mensagem de log para banco de dados:");
        String logDB = coelhinho.nextLine();
        logger.salvarRemoto(logDB);

        coelhinho.close();
    }
}
