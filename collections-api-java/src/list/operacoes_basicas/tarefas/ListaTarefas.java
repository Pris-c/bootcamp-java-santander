package list.operacoes_basicas.tarefas;

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
        List<Tarefa> tarefasRemocao = new ArrayList<>();
        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemocao.add(t);
            }
        }
        listaDeTarefas.removeAll(tarefasRemocao);
    }

    public int obterNumeroTotalDeTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricaoDasTarefas(){
        System.out.println(listaDeTarefas);
    }
}
