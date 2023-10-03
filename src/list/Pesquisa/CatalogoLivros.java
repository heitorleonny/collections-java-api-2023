package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        livroList.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return  livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulos = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulos = l;
                    break;
                }
            }
        }
        return livroPorTitulos;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor1", 1990);
        catalogoLivros.adicionarLivro("Livro2", "Autor1", 2000);
        catalogoLivros.adicionarLivro("Livro3", "Autor2", 2002);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1997, 2001));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));


    }
}
