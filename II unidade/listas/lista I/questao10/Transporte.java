package questao10;

class Transporte {
    protected int capacidadePassageiros;
    protected double velocidadeMaxima;
    protected double consumo; 
    protected double preco;

    public Transporte(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }

    public double calcularCustoViagem(double distancia) {
        return (distancia / consumo) * 5.50;
    }

    public void exibirDados() {
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Preço: R$ " + preco);
    }

    public int getCapacidadePassageiros() { return capacidadePassageiros; }
    public void setCapacidadePassageiros(int capacidadePassageiros) { this.capacidadePassageiros = capacidadePassageiros; }

    public double getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(double velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }

    public double getConsumo() { return consumo; }
    public void setConsumo(double consumo) { this.consumo = consumo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}

class Onibus extends Transporte {
    private int numeroEixos;

    public Onibus(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, int numeroEixos) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoBase = super.calcularCustoViagem(distancia);
        return custoBase * 0.80; 
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de Eixos: " + numeroEixos);
        System.out.println("Tipo: Ônibus");
    }

    public int getNumeroEixos() { return numeroEixos; }
    public void setNumeroEixos(int numeroEixos) { this.numeroEixos = numeroEixos; }
}

class Metro extends Transporte {
    private boolean eletrico;

    public Metro(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, boolean eletrico) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.eletrico = eletrico;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoBase = super.calcularCustoViagem(distancia);
        return custoBase * 0.70; 
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("É Elétrico: " + (eletrico ? "Sim" : "Não"));
        System.out.println("Tipo: Metrô");
    }

    public boolean isEletrico() { return eletrico; }
    public void setEletrico(boolean eletrico) { this.eletrico = eletrico; }
}
