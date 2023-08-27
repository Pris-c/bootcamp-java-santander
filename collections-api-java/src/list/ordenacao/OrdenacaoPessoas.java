package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    //Usando interface Comparable: Integra a classe do objeto trabalhado
    //O método sort() irá adotar o critério definido no método comparteTo() da interface Comparable
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pOrdenadaIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pOrdenadaIdade);
        return pOrdenadaIdade;
    }

    //Usando interface Comparator: Precisa de uma classe especifica para ser implementado

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pOrdenadaAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pOrdenadaAltura, new Pessoa.CompaaracaoPorAltura());
        return pOrdenadaAltura;

    }


}


