package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
            pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Pessoa1", 17, 1.63);
        ordenacaoPessoa.adicionarPessoa("Pessoa2", 90, 1.54);
        ordenacaoPessoa.adicionarPessoa("Pessoa3", 18, 1.80);
        ordenacaoPessoa.adicionarPessoa("Pessoa4", 5, 1.10);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }


}
