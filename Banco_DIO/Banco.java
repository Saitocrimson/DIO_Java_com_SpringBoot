package Banco_DIO;

import java.util.ArrayList;
import java.util.List;

public class Banco {
   public String nome_Banco;
   private List <Cliente>cl;
   public Banco(){
       this.cl=new ArrayList<>();
   }
   
   public boolean existeCli(String cpf){
       if(cl.size()>0){
           for(Cliente c:cl){
               if(c.getCpf().equalsIgnoreCase(cpf)){
                   return true;
           }
         }
       }
       return false;
   }
   public void listagemCli(){
        System.out.println(cl);
    }
   public void adicionarCliente(String nome,String cpf){
       if(!existeCli(cpf)){
           cl.add(new Cliente(nome,cpf));
           System.out.println("Cliente adicionado com sucesso"); 
       }
       else{
           System.out.println("Nao foi possivel criar um novo cliente"); 
       }  
   }
     public Cliente pesquisar_cliente(String cpf){
         if(!cl.isEmpty()){
            for(Cliente c :cl){
                if(c.getCpf().equalsIgnoreCase(cpf)){
                    return c;
                    
                }
            }
       }
       return null;
    }

   
   
    public void setNome_Banco(String nome_Banco) {
        this.nome_Banco = nome_Banco;
    }

    public List<Cliente> getCl() {
        return cl;
    }

    public void setCl(List<Cliente> cl) {
        this.cl = cl;
    }
   
}
