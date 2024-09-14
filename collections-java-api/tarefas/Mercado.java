package tarefas;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<CarrinhoDeCompras> carrinho;
    public Mercado(){
    this.carrinho=new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
    carrinho.add(new CarrinhoDeCompras(nome,preco,quantidade));
    System.out.println("Adicionado com sucesso: "+ nome);
    
    }
    public void removerItem(String nome){
    List<CarrinhoDeCompras> remover_carrinho =new ArrayList<>();
    for(CarrinhoDeCompras c : carrinho){
        if(c.getNome().equalsIgnoreCase(nome)){
            remover_carrinho.add(c);
        }
    }
    carrinho.removeAll(remover_carrinho);
    System.out.println("Removido "+nome+" com sucesso");
    
  }
   public double calcularValorTotal(){
    double valores=0;
    double aux;
    int i=0;
    for(CarrinhoDeCompras c : carrinho){
         aux=c.getPreco()*c.getQuantidade();
         valores=valores + aux;
     }
    return valores;
   
}
   public  void exibirItens(){
     System.out.println("Lista: "+carrinho);

   }
    public static void main(String[] args) {
        Mercado mercado= new Mercado();
        mercado.adicionarItem("Pudim", 12, 4);
        mercado.adicionarItem("Brownie", 20.50, 2);
        System.out.println("Total da compra:"+mercado.calcularValorTotal());
        mercado.exibirItens();
        mercado.removerItem("pudim");
        System.out.println("Total da compra:"+mercado.calcularValorTotal());
        mercado.exibirItens();
        
    }
}