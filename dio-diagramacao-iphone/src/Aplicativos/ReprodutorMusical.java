package Aplicativos;

public class ReprodutorMusical extends Aplicativo{

    public void tocar(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Tocando música.");
        }
    }
    public void pausar(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Musica pausada.");
        }
    }
    public void selecionarMusica(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Musica selecionada.");
        }
    }

}
