import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media, recuperacao, nova_media;

        System.out.println("Informe a nota 1:");
        nota1 = coelhinho.nextInt();
        System.out.println("Informe a nota 2:");
        nota2 = coelhinho.nextInt();
        System.out.println("Informe a nota 3:");
        nota3 = coelhinho.nextInt();
        System.out.println("Informe a nota 4:");
        nota4 = coelhinho.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4 ; 

        if (media >= 7) {
            System.out.println("Aprovado, media: " + media);
        } else {
            System.out.println("Informe a nota da recuperacao:");
            recuperacao = coelhinho.nextInt();

            nova_media = media + recuperacao; 

            if (nova_media>=7) {
                System.out.println("Aprovado na recuperacao, media: " + nova_media);
            } else {
                System.out.println("Reprovado, media: " + nova_media);
            }
        }

        coelhinho.close();


    }
}
