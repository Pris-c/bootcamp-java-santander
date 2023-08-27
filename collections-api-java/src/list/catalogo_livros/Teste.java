package list.catalogo_livros;

public class Teste {
    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();
        System.out.println("Adicionando livros");
        catalogo.adicionarLivro("O Livro do Teste", "Dev", 2023);
        catalogo.adicionarLivro("O Livro do Teste #2", "Dev", 2010);
        catalogo.adicionarLivro("O Livro do Teste #3", "Outro Dev", 2016);

        System.out.println();
        System.out.println("Pesquisando por autor \'Dev\'");
        System.out.println(catalogo.pesquisarPorAutor("Dev"));

        System.out.println();
        System.out.println("Pesquisando intervalo entre 2015 e 2025");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2015, 2025));

        System.out.println();
        System.out.println("Pesquisando por título \'O Livro do Teste\'");
        System.out.println(catalogo.pesquisarPorTítulo("O Livro do Teste"));


    }
}
