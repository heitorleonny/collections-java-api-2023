package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarNumeros {
    private List<Integer> numerosList;

    public OrdenarNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> getNumerosList() {
        return numerosList;
    }

    public List<Integer> ordenarOrdemCrescente(){
        List<Integer> ordemCrescente = new ArrayList<>(numerosList);
        Collections.sort(ordemCrescente, new Ordenar());
        return ordemCrescente;
    }

    public List<Integer> ordenarOrdemDecrescente(){
        List<Integer> ordemDecrescente = new ArrayList<>(numerosList);
        Collections.sort(ordemDecrescente, Collections.reverseOrder(new Ordenar()));
        return ordemDecrescente;
    }

    public static void main(String[] args) {
        OrdenarNumeros numeros = new OrdenarNumeros();
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(178);
        numeros.adicionarNumero(24);
        numeros.adicionarNumero(12);
        System.out.println(numeros.ordenarOrdemCrescente());
        System.out.println(numeros.ordenarOrdemDecrescente());
    }
}

class Ordenar implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i1, i2);
    }
}
