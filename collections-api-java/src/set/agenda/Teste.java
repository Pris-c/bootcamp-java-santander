package set.agenda;

public class Teste {

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Contato #1", 123123123);
        agenda.adicionarContato("Contato #2", 222222222);
        agenda.adicionarContato("Contato #1 novo", 111111111);
        agenda.adicionarContato("Contato #3", 333333333);
        agenda.adicionarContato("Contato #4", 444444444);
        agenda.adicionarContato("Contato #5", 555555555);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Contato #1"));

        agenda.atualizarNumeroContato("Contato #1", 9999999);
        agenda.exibirContatos();

    }
}
