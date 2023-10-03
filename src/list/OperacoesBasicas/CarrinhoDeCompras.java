package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: carrinhoDeCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itensParaRemover);
    }


    public void calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item item: carrinhoDeCompras){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println();
        System.out.println("Valor total da compra = " + valorTotal);
    }
    public void exibirItens(){
        for(Item i: carrinhoDeCompras){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Arroz", 4.50, 2);
        carrinho.adicionarItem("Sal", 2.00, 1);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.adicionarItem("Feijão", 3.0, 1);
        carrinho.removerItem("Arroz");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }


}


