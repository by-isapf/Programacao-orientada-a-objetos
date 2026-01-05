import java.util.Scanner;
import entidades.*;
import sistema.UrnaEletronica;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);
        UrnaEletronica urna = new UrnaEletronica();

        Partido p1 = new Partido("Partido dos Coelhos", "PC");
        Partido p2 = new Partido("Movimento dos Jabutis", "MJ");

        Prefeito prefeito1 = new Prefeito("Cacau", p1, 10);
        Prefeito prefeito2 = new Prefeito("Jabuti", p2, 20);
        Vereador vereador1 = new Vereador("Isabel", p1, 101);
        Vereador vereador2 = new Vereador("Bruno", p2, 202);

        urna.registrarCandidato(prefeito1);
        urna.registrarCandidato(prefeito2);
        urna.registrarCandidato(vereador1);
        urna.registrarCandidato(vereador2);

        System.out.println("\n=== SISTEMA DE VOTAÇÃO ===");

        while (true) {
            System.out.print("Digite o nome do eleitor: ");
            String nomeEleitor = coelhinho.nextLine().trim();

            if (nomeEleitor.equals("0")) {
                System.out.println("\nEncerrando votação...\n");
                break;
            }

            if (nomeEleitor.isEmpty()) {
                System.out.println("Nome inválido. Tente novamente.\n");
                continue;
            }

            System.out.print("Digite o número do candidato: ");
            String entradaNumero = coelhinho.nextLine().trim();

            int numero;
            try {
                numero = Integer.parseInt(entradaNumero);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.\n");
                continue;
            }

            Eleitor eleitor = new Eleitor(nomeEleitor);
            urna.receberVoto(new Voto(eleitor, numero));
            System.out.println();
        }

        urna.exibirResultados();
        coelhinho.close();
    }
}
