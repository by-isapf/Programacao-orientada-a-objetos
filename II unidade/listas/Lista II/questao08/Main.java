package questao08;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IComando> comandos = new ArrayList<>();

        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        String[] parametros = {"parametro1", "parametro2", "parametro3"};

        for (IComando comando : comandos) {
            comando.executar(parametros);
            System.out.println("----------------------");
        }
    }
}
