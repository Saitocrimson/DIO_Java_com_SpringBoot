
package Banco_DIO;

public class Conta_poupanca extends Conta_Banco {
    public Conta_poupanca(Cliente cliente){
        super(cliente);
}
    @Override
    public void imprimir() {
        System.out.println("Extrato Conta Poupanca ");
        super.imprimir_comuns();
    }
}
