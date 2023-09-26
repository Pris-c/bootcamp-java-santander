package gof.Strategy;

public class ComportamentoDefensivo implements ComportamentoStrategy{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente");
    }
}