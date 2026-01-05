package questao08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRATO GENÉRICO ===");
        Prato prato = new Prato("Macarrão a bolonhesa", 25.00, 20, Arrays.asList("Macarrão", "Alho", "Azeite", "Sal"));
        prato.exibirCardapio();

        System.out.println("\n=== PRATO VEGANO ===");
        PratoVegano vegano = new PratoVegano("Hambúrguer de caju", 30.00, 15, Arrays.asList("Hambúrguer de Grão-de-Bico", "Pão Integral", "Alface", "Tomate"), "Certificado Vegan Society");
        vegano.exibirCardapio();

        System.out.println("\n=== PRATO GOURMET ===");
        PratoGourmet gourmet = new PratoGourmet("Risoto de Camarão", 80.00, 45, Arrays.asList("Arroz Arbório", "Camarão", "Vinho Branco", "Manteiga"), "Chef Carlos Souza");
        gourmet.exibirCardapio();
    }
}
