package questao06;

class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected double duracao;
    protected double preco;

    public Midia(String titulo, int anoLancamento, double duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return preco * 0.10;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Preço: R$ " + preco);
        System.out.println("Preço do Aluguel: R$ " + calcularPrecoAluguel());
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public double getDuracao() { return duracao; }
    public void setDuracao(double duracao) { this.duracao = duracao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}

class Filme extends Midia {
    private String diretor;
    private String genero;

    public Filme(String titulo, int anoLancamento, double duracao, double preco, String diretor, String genero) {
        super(titulo, anoLancamento, duracao, preco);
        this.diretor = diretor;
        this.genero = genero;
    }

    @Override
    public double calcularPrecoAluguel() {
        return preco * 0.15;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Diretor: " + diretor);
        System.out.println("Gênero: " + genero);
        System.out.println("Tipo: Filme");
    }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}

class Serie extends Midia {
    private int numeroTemporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int anoLancamento, double duracao, double preco, int numeroTemporadas, int episodiosPorTemporada) {
        super(titulo, anoLancamento, duracao, preco);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public double calcularPrecoAluguel() {
        return preco * 0.12;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de Temporadas: " + numeroTemporadas);
        System.out.println("Episódios por Temporada: " + episodiosPorTemporada);
        System.out.println("Tipo: Série");
    }

    public int getNumeroTemporadas() { return numeroTemporadas; }
    public void setNumeroTemporadas(int numeroTemporadas) { this.numeroTemporadas = numeroTemporadas; }

    public int getEpisodiosPorTemporada() { return episodiosPorTemporada; }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) { this.episodiosPorTemporada = episodiosPorTemporada; }
}
