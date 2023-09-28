package Aplicativos;

public class Aplicativo {

    protected boolean verificarConexao(IphoneConnection connection){
        if (!connection.isConnected()){
            System.out.println("FALHA: Seu iPhone não está conectado à internet.");
            return false;
        } else {
            return true;
        }


    }
}
