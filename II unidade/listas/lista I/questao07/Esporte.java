package questao07;

class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected double duracaoPartida; 
    protected int popularidade; 

    public Esporte(String nome, int numeroJogadores, double duracaoPartida, int popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento() {
        return 500.00;
    }

    public void exibirRegras() {
        System.out.println("Nome do Esporte: " + nome);
        System.out.println("Número de Jogadores: " + numeroJogadores);
        System.out.println("Duração da Partida: " + duracaoPartida + " minutos");
        System.out.println("Popularidade: " + popularidade + "/100");
        System.out.println("Custo Base de Equipamento: R$ " + calcularCustoEquipamento());
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getNumeroJogadores() { return numeroJogadores; }
    public void setNumeroJogadores(int numeroJogadores) { this.numeroJogadores = numeroJogadores; }

    public double getDuracaoPartida() { return duracaoPartida; }
    public void setDuracaoPartida(double duracaoPartida) { this.duracaoPartida = duracaoPartida; }

    public int getPopularidade() { return popularidade; }
    public void setPopularidade(int popularidade) { this.popularidade = popularidade; }
}

class Futebol extends Esporte {
    private double tamanhoCampo; 

    public Futebol(String nome, int numeroJogadores, double duracaoPartida, int popularidade, double tamanhoCampo) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 300.00;
    }

    @Override
    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Tamanho do Campo: " + tamanhoCampo + " metros");
        System.out.println("Tipo: Futebol");
    }

    public double getTamanhoCampo() { return tamanhoCampo; }
    public void setTamanhoCampo(double tamanhoCampo) { this.tamanhoCampo = tamanhoCampo; }
}

class Basquete extends Esporte {
    private double alturaCesta; 

    public Basquete(String nome, int numeroJogadores, double duracaoPartida, int popularidade, double alturaCesta) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 400.00;
    }

    @Override
    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Altura da Cesta: " + alturaCesta + " metros");
        System.out.println("Tipo: Basquete");
    }

    public double getAlturaCesta() { return alturaCesta; }
    public void setAlturaCesta(double alturaCesta) { this.alturaCesta = alturaCesta; }
}
