package desafio3;

public class Pomba extends Animal implements Voador {
    public Pomba(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Pruu pruu!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando alto!");
    }
}
