package sistema;

import interfaces.Candidato;
import entidades.Voto;
import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {
    private List<Candidato> candidatosRegistrados;
    private List<Voto> votosComputados;

    public UrnaEletronica() {
        candidatosRegistrados = new ArrayList<>();
        votosComputados = new ArrayList<>();
    }

    public void registrarCandidato(Candidato novoCandidato) {
        for (Candidato c : candidatosRegistrados) {
            if (c.getNumeroCandidato() == novoCandidato.getNumeroCandidato()) {
                System.out.println("Erro: número já cadastrado!");
                return;
            }
        }
        candidatosRegistrados.add(novoCandidato);
        System.out.println("Candidato registrado com sucesso!");
    }

    public void receberVoto(Voto voto) {
        int numeroVotado = voto.getNumeroCandidatoVotado();
        Candidato candidatoEncontrado = null;

        for (Candidato c : candidatosRegistrados) {
            if (c.getNumeroCandidato() == numeroVotado) {
                candidatoEncontrado = c;
                break;
            }
        }

        if (candidatoEncontrado != null) {
            candidatoEncontrado.receberVoto();
            votosComputados.add(voto);
            System.out.println("Voto para o número " + numeroVotado + " confirmado!");
        } else {
            System.out.println("Voto nulo (candidato " + numeroVotado + " não encontrado).");
        }
    }

    public void exibirResultados() {
        System.out.println("\n===== RESULTADOS =====");
        for (Candidato c : candidatosRegistrados) {
            c.exibirDados();
        }
    }
}


