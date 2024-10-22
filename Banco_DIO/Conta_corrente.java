package Banco_DIO;

public class Conta_corrente extends Conta_Banco {
public Conta_corrente(Cliente cliente){
        super(cliente);
}
    @Override
    public void imprimir() {
        System.out.println("Extrato Conta Corrente ");
        super.imprimir_comuns();
    }
    
   
    
}
