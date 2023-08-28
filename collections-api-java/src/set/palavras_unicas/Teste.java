package set.palavras_unicas;

public class Teste {

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.exibirPalavrasUnicas();

        System.out.println();
        System.out.println("Adicionando palavras");
        conjunto.adicionarPalavra("Palavra #1");
        conjunto.adicionarPalavra("Palavra #3");
        conjunto.adicionarPalavra("Palavra #1");
        conjunto.adicionarPalavra("Palavra #2");

        conjunto.exibirPalavrasUnicas();

        System.out.println();
        System.out.println("Removendo Palavra #3");
        conjunto.removerPalavra("Palavra #3");
        conjunto.exibirPalavrasUnicas();

        System.out.println();
        System.out.println("Verificando Palavra #1");
        System.out.println(conjunto.verificarPalavra("Palavra #1"));
        System.out.println("Verificando Palavra #23");
        System.out.println(conjunto.verificarPalavra("Palavra #23"));

    }
}
