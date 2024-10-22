
package Banco_DIO;

public class Banco_Main {
    
    public static void transferencia_cc_cp(Conta_Banco cc,Conta_Banco cp,int valor ){
        if(cc.getSaldo()<valor){
            System.out.println("Nao foi possivel a transferencia");
            cc.imprimir();
            
        
        }
        else{
            cc.transferir(20, cp);
            cc.imprimir();
            cp.imprimir();
        }
        
    }
    
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        banco.adicionarCliente("Pudim","14896256");
        banco.adicionarCliente("joao","14896256");
        banco.adicionarCliente("maria","9872325");
        banco.adicionarCliente("yuki","7893245");
        banco.listagemCli();
       
        
        Conta_Banco cc=new Conta_corrente(banco.pesquisar_cliente("14896256"));
        Conta_Banco cp=new Conta_poupanca(banco.pesquisar_cliente("7893245"));
        
        cc.deposistar(100);
        transferencia_cc_cp(cc,cp,20);
       
        
    }
}
