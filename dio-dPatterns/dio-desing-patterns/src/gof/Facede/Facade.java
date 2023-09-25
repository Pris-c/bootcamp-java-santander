package gof.Facede;

import subsistema2.cep.CepApi;
import subsistema1.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
