package gof.Strategy;

public class ComportamentoNormal implements ComportamentoStrategy{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente");
    }
}
