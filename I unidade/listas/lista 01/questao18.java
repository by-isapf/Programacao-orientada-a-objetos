import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        
        Scanner coelhinho = new Scanner(System.in);

        int codigo;

        System.out.println("Informe um numero:");
        codigo = coelhinho.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("codigo: um");
                break;
            case 2:
                System.out.println("codigo: dois");
                break;
            case 3:
                System.out.println("codigo: três");
                break;
            default:
                System.out.println("codigo invalido");
                break;
        }

        coelhinho.close();
    }
}
