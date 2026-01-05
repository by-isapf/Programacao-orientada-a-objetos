package entidades;

public class Voto {
    private Eleitor eleitor;
    private int numeroCandidatoVotado;

    public Voto(Eleitor eleitor, int numeroCandidatoVotado) {
        this.eleitor = eleitor;
        this.numeroCandidatoVotado = numeroCandidatoVotado;
    }

    public int getNumeroCandidatoVotado() {
        return numeroCandidatoVotado;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }
}


