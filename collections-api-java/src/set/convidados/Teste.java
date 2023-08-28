package set.convidados;

public class Teste {

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " elementos no Set de convidados");

        System.out.println();
        System.out.println("Adicionando elementos");
        convidados.adicionarConvidado("Convidado #1", 1);
        convidados.adicionarConvidado("Convidado #2", 2);
        convidados.adicionarConvidado("Convidado #3", 3);
        convidados.adicionarConvidado("Convidado #4", 3);
        System.out.println("Existem " + convidados.contarConvidados() + " elementos no Set de convidados");

        convidados.exibirConvidados();

        System.out.println();
        System.out.println("Removendo candidato com código 2");
        convidados.removerConvidadoPorCodigoConvite(2);
        System.out.println("Existem " + convidados.contarConvidados() + " elementos no Set de convidados");
        convidados.exibirConvidados();

    }
}
