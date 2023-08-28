package set.cadastro_produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco){
        produtosSet.add(new Produto(cod, nome, qtd, preco));
    }

    public Set<Produto> getProdutosSet() {
        return produtosSet;
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet); //Organiza de acordo com o Comparable
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco()); //Organiza de acordo com o Comparator passado
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }




}
