package tarefas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavra;

    public ConjuntoPalavrasUnicas() {
        this.palavra=new HashSet<>();
    }
    public void adicionarPalavra(String p){
        palavra.add(p);
    }
    public void removerPalavra(String p){
        if(palavra.isEmpty()){
            System.out.println("Vazio");
        }
        for(String s:palavra){
            if(s.equals(p)){
                 palavra.remove(p);
                 System.out.println("Removido com sucesso");
                  break;
              }
         }
    }
    public String pesquisarPorNome(String p){
        for(String s:palavra){
            if(s.equals(p)){
                 return "Encontrada a palavra "+p;
                
            }
         }
        return "Nada encontrado";
    }
    
    public void exibirPalavrasUnicas()
    {
     System.out.println(palavra);

    }
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens= new ConjuntoPalavrasUnicas();
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.pesquisarPorNome("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.pesquisarPorNome("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
        }
    
}
