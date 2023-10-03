/*Crie uma classe chamada "SomaNumeros"
        que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

        adicionarNumero(int numero): Adiciona um número à lista de números.
        calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
        encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
        encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
        exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.*/
package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer i: numerosList){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(Integer i: numerosList){
            if(i > maior){
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(Integer i: numerosList){
            if(i < menor){
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.print(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(10);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(17);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(0);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
