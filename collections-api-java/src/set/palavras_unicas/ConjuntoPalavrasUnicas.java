package set.palavras_unicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> conjuntoPalavrasUnicas;


    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public Set<String> getConjuntoPalavrasUnicas() {
        return conjuntoPalavrasUnicas;
    }


    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!conjuntoPalavrasUnicas.isEmpty()) {
            for (String p : conjuntoPalavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    conjuntoPalavrasUnicas.remove(palavra);
                    break;
                }
            }
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public String verificarPalavra(String palavra){

        if (!conjuntoPalavrasUnicas.isEmpty()) {
            for (String p : conjuntoPalavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    return "A palavra \'" + palavra + "\' existe no conjunto";
                }
            }
        } else {
            System.out.println("O conjunto está vazio");
        }
        return "A palavra \'" + palavra + "\' NÃO existe no conjunto";
    }

    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavrasUnicas.isEmpty()) {
            System.out.println(conjuntoPalavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(getConjuntoPalavrasUnicas(), that.getConjuntoPalavrasUnicas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConjuntoPalavrasUnicas());
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavrasUnicas=" + conjuntoPalavrasUnicas +
                '}';
    }
}
