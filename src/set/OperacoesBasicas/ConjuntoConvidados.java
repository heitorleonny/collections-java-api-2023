package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Fulano", 3456);
        conjuntoConvidados.adicionarConvidado("Ciclano", 2222);
        conjuntoConvidados.adicionarConvidado("Beltrano", 1234);
        conjuntoConvidados.adicionarConvidado("Beltrano", 1234);
        conjuntoConvidados.adicionarConvidado("Sei lá", 1234);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(2222);
        conjuntoConvidados.exibirConvidados();
    }
}
