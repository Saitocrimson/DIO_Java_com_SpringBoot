
package tarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> ordenar;
    public OrdenacaoNumeros() {
        this.ordenar = new ArrayList<>();
    }
    public void adicionarNumero(int num){
        ordenar.add(num);
    }
    public List<Integer>ordenarAscendente(){
        List<Integer>aux=new ArrayList<>(ordenar);
        if(!ordenar.isEmpty()){
            Collections.sort(aux);
          
        }
      return aux;
        
    }
      public List<Integer>ordenarDescendente(){
        List<Integer>aux=new ArrayList<>(ordenar);
        if(!ordenar.isEmpty()){
            aux.sort(Collections.reverseOrder());
          
        }
      return aux;
        
    }
      public void exibirNumeros(){
      System.out.println(ordenar);
      }
      public static void main(String[] args) {
            OrdenacaoNumeros numeros = new OrdenacaoNumeros();  
            // Peguei essa parte  do codigo do repositorio da camila
            // Adicionando números à lista
            numeros.adicionarNumero(2);
            numeros.adicionarNumero(5);
            numeros.adicionarNumero(4);
            numeros.adicionarNumero(1);
            numeros.adicionarNumero(99);
        
            // Exibindo a lista de números adicionados
            numeros.exibirNumeros();
        
            // Ordenando e exibindo em ordem ascendente
            System.out.println(numeros.ordenarAscendente());
        
            // Exibindo a lista
            numeros.exibirNumeros();
        
            // Ordenando e exibindo em ordem descendente
            System.out.println(numeros.ordenarDescendente());
        
            // Exibindo a lista
            numeros.exibirNumeros();
            }
}
