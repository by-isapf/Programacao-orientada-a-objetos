package questao01;

public class Fatura implements IImprimivel {

    @Override
    public void imprimir(int copias) {
        if (copias > 5) {
            System.out.println("Imprimindo " + copias + " cópias em modo rascunho.");
        } else {
            System.out.println("Imprimindo " + copias + " cópias em modo alta qualidade.");
        }
    }
}
