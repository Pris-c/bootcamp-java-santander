package Aplicativos;

public class IphoneConnection {

    private static IphoneConnection instancia = null;
    private static boolean connected;


    private IphoneConnection() {
        connected = true;
    }

    public static IphoneConnection getInstance(){
        if (instancia == null){
            instancia = new IphoneConnection();
        }
        return instancia;
    }

    public boolean isConnected(){
        return connected;
    }

    public void conectar(){
        connected = true;
    }

    public void desconectar(){
        connected = false;
    }


}
