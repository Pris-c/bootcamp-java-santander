package set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        convidadosSet = new HashSet<>();
    }


    public void adicionarConvidado(String nome, int codigo){
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigo){
        Convidado convidadoRemover = null;
        for(Convidado c: convidadosSet){
            if (c.getCodigoConvite() == codigo){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }


}
