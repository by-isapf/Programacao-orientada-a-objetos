package questao04;

public class Main {
    public static void main(String[] args) {
        TarefaLonga tarefa = new TarefaLonga();

        tarefa.executar();

        System.out.println("Tarefa finalizada? " + tarefa.isConcluida());
    }
}
