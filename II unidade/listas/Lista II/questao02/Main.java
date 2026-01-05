package questao02;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor devJunior = new Desenvolvedor("Isabel Freire", 1, 5000.00);
        Desenvolvedor devPleno = new Desenvolvedor("Isabel Paiva", 2, 7000.00);
        Desenvolvedor devSenior = new Desenvolvedor("Alberto", 3, 10000.00);
        Desenvolvedor devOutro = new Desenvolvedor("Cacau", 4, 4000.00);

        devJunior.calcularBonificacao();
        devPleno.calcularBonificacao();
        devSenior.calcularBonificacao();
        devOutro.calcularBonificacao();
    }
}

