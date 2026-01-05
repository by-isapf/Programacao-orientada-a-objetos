import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        int matricula;
        double nota;
        double soma_notas = 0;
        int quantidade_lunos = 0;

        System.out.println("Digite o número de matrícula e a nota do aluno:");

        while (true) {
            System.out.print("\nMatrícula: ");
            matricula = coelhinho.nextInt();

            if (matricula == 0) {
                break;
            }

            System.out.print("Nota: ");
            nota = coelhinho.nextDouble();

            soma_notas += nota;
            quantidade_lunos++;
        }

        if (quantidade_lunos > 0) {
            double media = soma_notas / quantidade_lunos;
            System.out.println("\nMédia da turma = " + media);
        } else {
            System.out.println("\nNenhum aluno informado.");
        }

        coelhinho.close();
    }
}
