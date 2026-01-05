import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];

        System.out.println("Cadastro das 20 candidatas:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Nome da candidata " + (i + 1) + ": ");
            nomes[i] = coelhinho.next();

            System.out.print("Idade da candidata " + (i + 1) + ": ");
            idades[i] = coelhinho.nextInt();
        }

        System.out.println("\nCandidatas aptas");
        boolean encontrou = false;
        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i] + " (" + idades[i] + " anos)");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma candidata está apta.");
        }

        coelhinho.close();
    }
}
