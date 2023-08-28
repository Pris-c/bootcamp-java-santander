package set.cadastro_produtos;

public class Teste {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 5, 15d);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 10, 20d);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 2, 10d);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2, 2d);

        System.out.println(cadastroProdutos.getProdutosSet());

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
        System.out.println(cadastroProdutos.exibirProdutoPorNome());


    }
}
