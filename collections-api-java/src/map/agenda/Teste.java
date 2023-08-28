package map.agenda;

public class Teste {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Primeiro", 11111111);
        agendaContatos.adicionarContato("Segundo", 22222222);
        agendaContatos.adicionarContato("Terceiro", 33333333);
        agendaContatos.adicionarContato("Primeiro", 44444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Terceiro");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.procurarPorNome("Primeiro"));

    }

}
