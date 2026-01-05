package desafio3;

public class Pato extends Animal implements Voador, Nadador {
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Quack quack!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando baixo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando no lago.");
    }
}
