package questao02;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CONTA BANCÁRIA ===");
        ContaBancaria conta1 = new ContaBancaria("001", "Isabel", 1500.00);
        conta1.consultarSaldo();
        conta1.depositar(500);
        conta1.sacar(300);
        conta1.consultarSaldo();

        System.out.println("\n=== CONTA CORRENTE ===");
        ContaCorrente corrente = new ContaCorrente("002", "Isabel", 1000.00, 500.00);
        corrente.consultarSaldo();
        corrente.sacar(1300);
        corrente.consultarSaldo();

        System.out.println("\n=== CONTA POUPANÇA ===");
        ContaPoupanca poupanca = new ContaPoupanca("003", "Isabel", 2000.00, 0.05);
        poupanca.consultarSaldo();
        poupanca.aplicarRendimento();
        poupanca.consultarSaldo();
    }
}
