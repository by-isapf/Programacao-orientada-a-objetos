package desafio3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coelhinho = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        System.out.println("=== Sistema de Animais ===");

        while (true) {
            System.out.println("\nEscolha um tipo de animal para adicionar:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Pomba");
            System.out.println("3 - Pato");
            System.out.println("0 - Sair e mostrar todos os animais");
            System.out.print("Opção: ");
            int opcao = coelhinho.nextInt();
            coelhinho.nextLine(); 

            if (opcao == 0) {
                break;
            }

            System.out.print("Digite o nome do animal: ");
            String nome = coelhinho.nextLine();

            switch (opcao) {
                case 1:
                    animais.add(new Cachorro(nome));
                    break;
                case 2:
                    animais.add(new Pomba(nome));
                    break;
                case 3:
                    animais.add(new Pato(nome));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println(nome + " adicionado com sucesso!");
        }

        System.out.println("\n=== Mostrando comportamentos ===");
        for (Animal a : animais) {
            a.comer();
            a.fazerSom();

            if (a instanceof Voador) {
                ((Voador) a).voar();
            }

            if (a instanceof Nadador) {
                ((Nadador) a).nadar();
            }

            System.out.println("-----------------------------");
        }

        coelhinho.close();
    }
}
