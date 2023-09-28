package Aplicativos;

public class NavegadorDeInternet extends Aplicativo {

    public void exibirPagina(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Exibindo Pagina ");
        }
    }
    public void adicionarNovaAba(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Nova aba aberta");
        }
    }
    public void atualizarPagina(IphoneConnection connection){
        if (super.verificarConexao(connection)) {
            System.out.println("Página atualizada");
        }
    }
}
