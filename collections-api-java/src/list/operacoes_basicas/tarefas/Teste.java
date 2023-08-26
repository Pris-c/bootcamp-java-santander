package list.operacoes_basicas.tarefas;

public class Teste {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalDeTarefas());

        System.out.println();
        System.out.println("Executando:  listaTarefas.adicionarTarefa(\"Tarefa #1\")");
        System.out.println("Executando:  listaTarefas.adicionarTarefa(\"Tarefa #1\")");
        System.out.println("Executando:  listaTarefas.adicionarTarefa(\"Tarefa #3\")");
        listaTarefas.adicionarTarefa("Tarefa #1");
        listaTarefas.adicionarTarefa("Tarefa #1");
        listaTarefas.adicionarTarefa("Tarefa #3");

        System.out.println();
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalDeTarefas());

        System.out.println();
        System.out.println("Executando:  listaTarefas.removerTarefa(\"Tarefa #1\");");
        listaTarefas.removerTarefa("Tarefa #1");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalDeTarefas());


        System.out.println();
        System.out.println("Executando:  listaTarefas.obterDescricaoDasTarefas();");
        listaTarefas.obterDescricaoDasTarefas();


    }

}
