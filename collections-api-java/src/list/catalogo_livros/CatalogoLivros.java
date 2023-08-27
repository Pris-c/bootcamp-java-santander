package list.catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaAutor.add(l);
                }
            }
        }
        return listaAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal) {
                    listaIntervaloAnos.add(l);
                }
            }
        }
        return listaIntervaloAnos;
    }

    public Livro pesquisarPorTítulo(String titulo){
        //Livro livroTitulo = null;
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    return l;
                }
            }
        }
        return null;
    }




}
