package questao04;

class Imovel {
    protected String endereco;
    protected double area; 
    protected int numeroQuartos;
    protected double preco;

    public Imovel(String endereco, double area, int numeroQuartos, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
    }

    public double calcularTaxaAdministracao() {
        return preco * 0.08;
    }

    public void exibirCaracteristicas() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Área: " + area + " m²");
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Taxa de Administração: R$ " + calcularTaxaAdministracao());
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

    public int getNumeroQuartos() { return numeroQuartos; }
    public void setNumeroQuartos(int numeroQuartos) { this.numeroQuartos = numeroQuartos; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}

class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    public Apartamento(String endereco, double area, int numeroQuartos, double preco, int andar, double valorCondominio) {
        super(endereco, area, numeroQuartos, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.06;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Andar: " + andar);
        System.out.println("Valor do Condomínio: R$ " + valorCondominio);
        System.out.println("Tipo: Apartamento");
    }

    public int getAndar() { return andar; }
    public void setAndar(int andar) { this.andar = andar; }

    public double getValorCondominio() { return valorCondominio; }
    public void setValorCondominio(double valorCondominio) { this.valorCondominio = valorCondominio; }
}

class Casa extends Imovel {
    private double areaQuintal;
    private boolean temPiscina;

    public Casa(String endereco, double area, int numeroQuartos, double preco, double areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.10;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Área do Quintal: " + areaQuintal + " m²");
        System.out.println("Possui Piscina: " + (temPiscina ? "Sim" : "Não"));
        System.out.println("Tipo: Casa");
    }

    public double getAreaQuintal() { return areaQuintal; }
    public void setAreaQuintal(double areaQuintal) { this.areaQuintal = areaQuintal; }

    public boolean isTemPiscina() { return temPiscina; }
    public void setTemPiscina(boolean temPiscina) { this.temPiscina = temPiscina; }
}
