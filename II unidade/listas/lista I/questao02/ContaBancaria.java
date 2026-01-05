package questao02;

class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected String titular;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }
}

class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado (utilizando cheque especial, se necessário).");
        } else {
            System.out.println("Limite insuficiente para o saque.");
        }
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
        System.out.println("Limite Cheque Especial: R$ " + limiteChequeEspecial);
    }

    public double getLimiteChequeEspecial() { return limiteChequeEspecial; }
    public void setLimiteChequeEspecial(double limiteChequeEspecial) { this.limiteChequeEspecial = limiteChequeEspecial; }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento; 

    public ContaPoupanca(String numeroConta, String titular, double saldoInicial, double taxaRendimento) {
        super(numeroConta, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado com sucesso!");
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
        System.out.println("Taxa de Rendimento: " + (taxaRendimento * 100) + "%");
    }

    public double getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(double taxaRendimento) { this.taxaRendimento = taxaRendimento; }
}
