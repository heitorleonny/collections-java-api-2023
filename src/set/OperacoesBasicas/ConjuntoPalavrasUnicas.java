package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavras);
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p: palavras){
            if(p == palavra){
                palavraParaRemover = p;
                break;
            }
        }
        palavras.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        boolean estaContida = false;
        for(String p: palavras){
            if(p == palavra){
                estaContida = true;
                break;
            }
        }
        if(estaContida){
            System.out.println("A palavra " + palavra + " está contida no conjunto!");
        }
        else{
            System.out.println("A palavra " + palavra + " NÃO está contida no conjunto!");
        }
    }

    public void exibirPalavras(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        conjuntoPalavrasUnicas.adicionarPalavra("Papel");
        conjuntoPalavrasUnicas.adicionarPalavra("Cerca");
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra("Papel");
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.verificarPalavra("Papel");
        conjuntoPalavrasUnicas.verificarPalavra("Casa");
    }
}
