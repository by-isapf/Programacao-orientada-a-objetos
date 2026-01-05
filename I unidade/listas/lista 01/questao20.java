import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int a,b,c;

         do {
            System.out.print("digite um valor maior que zero: ");
            a = coelhinho.nextInt();
            if (a <= 0) System.out.println("valor invalido, tente novamente");
        } while (a <= 0);

        do {
            System.out.print("digite um valor maior que zero:");
            b = coelhinho.nextInt();
            if (b <= 0) System.out.println("valor invalido, tente novamente");
        } while (b <= 0);

        do {
            System.out.print("digite um valor maior que zero: ");
            c = coelhinho.nextInt();
            if (c <= 0) System.out.println("valor invalido, tente novamente");
        } while (c <= 0);

       
        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));

      
        int multiplicacao = menor * maior;
        double divisao = (double) maior / menor;
        
        System.out.println("Resultados:");
        System.out.println("menor valor: " + menor);
        System.out.println("maior valor: " + maior);
        System.out.println("menor * maior = " + multiplicacao);
        System.out.println("Mmior / menor = " + divisao);

        coelhinho.close();
    }
}
