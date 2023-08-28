package map.estoque;

public class Teste {

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1l, "Produto A", 10, 5d);
        estoque.adicionarProduto(2l, "Produto B", 5, 10d);
        estoque.adicionarProduto(3l, "Produto C", 2, 15d);

        estoque.exibirTodosOsProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularTotalEstoque());
        System.out.println("Produto mais caro: R$ " + estoque.obterProdutoMaisCaro());

    }

}
