package gof.Strategy;

public class ComportamentoAgressivo implements ComportamentoStrategy{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente");
    }
}
