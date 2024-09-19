
package tarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SomarNumeros {
    private List<Integer> numeros;

    public SomarNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int num){
        numeros.add(num);
    }
    public int somarTudo(){
        int soma=0;
        if(numeros.isEmpty()) return 0;
        for(Integer i:numeros){
            soma+=i;
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        if(numeros.isEmpty()) return 0;
        return Collections.max(numeros);
    }
    public int encontrarMenorNumero(){
        if(numeros.isEmpty()) return 0;
        return Collections.min(numeros);
    }
    public void exibirNumeros(){
        System.out.println(numeros);
    }
    public static void main(String[] args) {
        SomarNumeros n1= new SomarNumeros();
        /*n1.adicionarNumero(450);
        n1.adicionarNumero(158);
        n1.adicionarNumero(300);
        n1.adicionarNumero(789);*/
        n1.exibirNumeros();
        System.out.println(n1.encontrarMaiorNumero());
        System.out.println(n1.encontrarMenorNumero());
        System.out.println(n1.somarTudo());
    }
}
