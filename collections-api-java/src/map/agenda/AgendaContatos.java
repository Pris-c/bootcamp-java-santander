package map.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaMap);
    }

    public Integer procurarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()){
            numeroPorNome=agendaMap.get(nome);
        }
        return numeroPorNome;
    }

}
