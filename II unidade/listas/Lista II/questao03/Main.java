package questao03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IProcessadorDeDados> processadores = new ArrayList<>();

        processadores.add(new ProcessadorCSV());

        String[] dadosCSV = {
            "id,nome,idade",
            "1,Isabel Freire,21",
            "2,Isabel Paiva,25",
            "3,Cacau,30"
        };

        for (IProcessadorDeDados p : processadores) {
            p.processar(dadosCSV);
        }
    }
}
