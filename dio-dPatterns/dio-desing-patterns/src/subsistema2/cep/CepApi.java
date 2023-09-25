package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }


    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Montes Claros";
    }
    public String recuperarEstado(String cep){
        return "MG";
    }
}
