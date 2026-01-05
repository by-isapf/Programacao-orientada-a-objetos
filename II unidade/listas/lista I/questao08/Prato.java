package questao08;

import java.util.List;

class Prato {
    protected String nome;
    protected double preco;
    protected int tempoPreparo; 
    protected List<String> ingredientes;

    public Prato(String nome, double preco, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public double calcularTaxaServico() {
        return preco * 0.10;
    }

    public void exibirCardapio() {
        System.out.println("Nome do Prato: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tempo de Preparo: " + tempoPreparo + " minutos");
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
        System.out.println("Taxa de Serviço: R$ " + calcularTaxaServico());
        System.out.println("Preço Final com Taxa: R$ " + (preco + calcularTaxaServico()));
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getTempoPreparo() { return tempoPreparo; }
    public void setTempoPreparo(int tempoPreparo) { this.tempoPreparo = tempoPreparo; }

    public List<String> getIngredientes() { return ingredientes; }
    public void setIngredientes(List<String> ingredientes) { this.ingredientes = ingredientes; }
}

class PratoVegano extends Prato {
    private String certificacaoVegan;

    public PratoVegano(String nome, double preco, int tempoPreparo, List<String> ingredientes, String certificacaoVegan) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.certificacaoVegan = certificacaoVegan;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.05;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Certificação Vegana: " + certificacaoVegan);
        System.out.println("Tipo: Prato Vegano");
    }

    public String getCertificacaoVegan() { return certificacaoVegan; }
    public void setCertificacaoVegan(String certificacaoVegan) { this.certificacaoVegan = certificacaoVegan; }
}

class PratoGourmet extends Prato {
    private String chefResponsavel;

    public PratoGourmet(String nome, double preco, int tempoPreparo, List<String> ingredientes, String chefResponsavel) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.chefResponsavel = chefResponsavel;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.15;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Chef Responsável: " + chefResponsavel);
        System.out.println("Tipo: Prato Gourmet");
    }

    public String getChefResponsavel() { return chefResponsavel; }
    public void setChefResponsavel(String chefResponsavel) { this.chefResponsavel = chefResponsavel; }
}
