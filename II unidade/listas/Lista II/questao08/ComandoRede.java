package questao08;

public class ComandoRede implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Rede...");
        for (String p : parametros) {
            System.out.println("Parâmetro: " + p);
        }
    }
}

