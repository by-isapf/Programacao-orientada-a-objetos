package questao08;

public class ComandoArquivo implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Arquivo...");
        for (String p : parametros) {
            System.out.println("Parâmetro: " + p);
        }
    }
}

