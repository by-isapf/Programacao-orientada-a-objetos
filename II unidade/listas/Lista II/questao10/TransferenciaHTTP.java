package questao10;

public class TransferenciaHTTP implements ITransferencia {

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("Iniciando download via HTTP...");

        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos += 10;
            if (bytesRecebidos > tamanhoTotal) {
                bytesRecebidos = tamanhoTotal;
            }
            System.out.println("Progresso: " + bytesRecebidos + "/" + tamanhoTotal + " bytes");

            if (bytesRecebidos >= tamanhoTotal / 2 && continuar) {
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Download Completo!");
        } else {
            System.out.println("Download Pausado/Interrompido.");
        }
    }
}
