package list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }


    public void removerTarefa(String descricao){
        listaDeTarefas.removeIf(i -> i.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalDeTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricaoDasTarefas(){
        System.out.println(listaDeTarefas);
    }
}
