package questao03;

class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected double preco;
    protected String nivel;

    public Curso(String nome, int cargaHoraria, double preco, String nivel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public double calcularDesconto() {
        return preco * 0.10;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Preço: R$ " + preco);
        System.out.println("Nível: " + nivel);
        System.out.println("Desconto: R$ " + calcularDesconto());
        System.out.println("Preço Final com Desconto: R$ " + (preco - calcularDesconto()));
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
}

class CursoPresencial extends Curso {
    private String local;

    public CursoPresencial(String nome, int cargaHoraria, double preco, String nivel, String local) {
        super(nome, cargaHoraria, preco, nivel);
        this.local = local;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Local: " + local);
        System.out.println("Tipo: Curso Presencial");
    }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
}

class CursoOnline extends Curso {
    private String plataforma;

    public CursoOnline(String nome, int cargaHoraria, double preco, String nivel, String plataforma) {
        super(nome, cargaHoraria, preco, nivel);
        this.plataforma = plataforma;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Tipo: Curso Online");
    }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }
}
