package questao05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidadorSeguranca validador = new ValidadorSeguranca();
        Scanner coelhinho = new Scanner(System.in);

        System.out.println("Digite sua senha para validação:");
        String senha = coelhinho.nextLine();

        validador.validarAcesso(senha);

        coelhinho.close();
    }
}


