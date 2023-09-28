import Aplicativos.AparelhoTelefonico;
import Aplicativos.IphoneConnection;
import Aplicativos.NavegadorDeInternet;
import Aplicativos.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        IphoneConnection connection = IphoneConnection.getInstance();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorDeInternet browser = new NavegadorDeInternet();
        ReprodutorMusical mediaPlayes = new ReprodutorMusical();


        System.out.println("\niPhone está conectado: " + connection.isConnected());
        System.out.println("\ntelefone.ligar:");
        telefone.ligar(connection);
        System.out.println("\ntelefone.atender:");
        telefone.atender(connection);

        System.out.println("\nDESCONECTANDO IPHONE");
        connection.desconectar();
        System.out.println("\ntelefone.iniciarCorreioVoz:");
        telefone.iniciarCorreioVoz(connection);
        System.out.println("\nbrowser.novaAba:");
        browser.adicionarNovaAba(connection);

        System.out.println("\nCONECTANDO IPHONE");
        connection.conectar();
        System.out.println("\nbrowser.atualizarPagina:");
        browser.atualizarPagina(connection);
        System.out.println("\nbrowser.exibirPagina:");
        browser.exibirPagina(connection);
        System.out.println("\nmediaPlayer.selecionarMusica");
        mediaPlayes.selecionarMusica(connection);
        System.out.println("\nmediaPlayer.tocar");
        mediaPlayes.tocar(connection);
        System.out.println("\nmediaPlayer.pausar");
        mediaPlayes.pausar(connection);
        System.out.println("\nmediaPlayer.pausar");
        mediaPlayes.pausar(connection);




    }
}