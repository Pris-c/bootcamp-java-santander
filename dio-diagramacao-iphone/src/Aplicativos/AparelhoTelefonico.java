package Aplicativos;

public class AparelhoTelefonico extends Aplicativo {

    public void ligar(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Realizando chamada");
        }
    }
    public void atender(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Estou!");
        }
    }
    public void iniciarCorreioVoz(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Executando correio de voz");
        }
    }

}
