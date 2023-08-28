package map.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco){
        estoqueMap.put(cod, new Produto(nome, preco, qtd));
    }


    public void exibirTodosOsProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularTotalEstoque(){
        double estoqueTotal = 0d;
        if (!estoqueMap.isEmpty()){
            for (Produto p: estoqueMap.values()){
                estoqueTotal+= (p.getQuantidade()*p.getPreco());
            }
        }
        return estoqueTotal;
    }

    public Produto obterProdutoMaisCaro(){
        double  maiorValor = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        if (!estoqueMap.isEmpty()){
            for (Produto p: estoqueMap.values()){
                if (p.getPreco()>maiorValor){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

}
