package desafio4;

public class CaixaDeSom implements ReprodutorAudio {
    @Override
    public void tocarMusica(String faixa) {
        System.out.println("Tocando música: " + faixa);
    }
}
