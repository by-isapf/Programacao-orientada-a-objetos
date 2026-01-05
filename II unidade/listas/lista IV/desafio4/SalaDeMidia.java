package desafio4;

public class SalaDeMidia {
    public void iniciarSessaoDeMusica(ReprodutorAudio dispositivo, String faixa) {
        System.out.println("\n🎶 Iniciando sessão de música...");
        dispositivo.tocarMusica(faixa);
    }

    public void iniciarSessaoDeFilme(ReprodutorVideo dispositivo, String filme) {
        System.out.println("\n🎬 Iniciando sessão de filme...");
        dispositivo.tocarVideo(filme);
    }
}
