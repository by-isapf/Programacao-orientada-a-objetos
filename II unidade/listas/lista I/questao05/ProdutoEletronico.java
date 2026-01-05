package questao05;

class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected String voltagem; 

    public ProdutoEletronico(String marca, String modelo, double preco, String voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida() {
        return preco * 0.15;
    }

    public void exibirEspecificacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Garantia Estendida: R$ " + calcularGarantiaEstendida());
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getVoltagem() { return voltagem; }
    public void setVoltagem(String voltagem) { this.voltagem = voltagem; }
}

class Smartphone extends ProdutoEletronico {
    private double tamanhoTela; 
    private int capacidadeBateria; 

    public Smartphone(String marca, String modelo, double preco, String voltagem, double tamanhoTela, int capacidadeBateria) {
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.20;
    }

    @Override
    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " mAh");
        System.out.println("Tipo: Smartphone");
    }

    public double getTamanhoTela() { return tamanhoTela; }
    public void setTamanhoTela(double tamanhoTela) { this.tamanhoTela = tamanhoTela; }

    public int getCapacidadeBateria() { return capacidadeBateria; }
    public void setCapacidadeBateria(int capacidadeBateria) { this.capacidadeBateria = capacidadeBateria; }
}

class Notebook extends ProdutoEletronico {
    private String processador;
    private int memoriaRAM; 

    public Notebook(String marca, String modelo, double preco, String voltagem, String processador, int memoriaRAM) {
        super(marca, modelo, preco, voltagem);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.25;
    }

    @Override
    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Tipo: Notebook");
    }

    public String getProcessador() { return processador; }
    public void setProcessador(String processador) { this.processador = processador; }

    public int getMemoriaRAM() { return memoriaRAM; }
    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }
}
