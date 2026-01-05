package questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        System.out.println("Digite o tamanho total do download (em bytes):");
        int tamanhoTotal = coelhinho.nextInt();

        ITransferencia transferencia = new TransferenciaHTTP();
        transferencia.iniciarDownload(tamanhoTotal);

        coelhinho.close();
    }
}
