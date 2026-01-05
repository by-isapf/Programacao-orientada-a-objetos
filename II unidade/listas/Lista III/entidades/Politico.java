package entidades;

import interfaces.Candidato;

public abstract class Politico implements Candidato {
    protected String nome;
    protected Partido partido;
    protected int numeroCandidato;
    protected int totalVotos;

    public Politico(String nome, Partido partido, int numeroCandidato) {
        this.nome = nome;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
        this.totalVotos = 0;
    }

    @Override
    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    @Override
    public void receberVoto() {
        totalVotos++;
    }

    @Override
    public int getTotalVotos() {
        return totalVotos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + partido.getNome() + " (" + partido.getSigla() + ")");
        System.out.println("Número: " + numeroCandidato);
        System.out.println("Cargo: " + getCargo());
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("---------------------------");
    }

    public abstract String getCargo();
}
