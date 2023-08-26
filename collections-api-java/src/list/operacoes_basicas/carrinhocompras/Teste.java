package list.operacoes_basicas.carrinhocompras;

public class Teste {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("Exibir itens:");
        carrinho.exibirItens();

        System.out.println();
        System.out.println("Adicionando itens");
        carrinho.adicionarItem("kinderOvo", 2.99, 2);
        carrinho.adicionarItem("kinderOvo", 2.33, 5);
        carrinho.adicionarItem("ruffles", 3.17, 3);

        System.out.println();
        System.out.println("Exibir itens:");
        carrinho.exibirItens();


        System.out.println();
        System.out.println("Valor Total: R$ " + carrinho.calcularValorTotal());

        System.out.println();
        System.out.println("Removendo kinderOvo");
        carrinho.removerItem("kinderOvo");

        System.out.println();
        System.out.println("Exibir itens: ");
        carrinho.exibirItens();





    }
}
