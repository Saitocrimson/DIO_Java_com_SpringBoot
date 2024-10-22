package Banco_DIO;
public abstract class Conta_Banco implements Iconta {
    protected static final int AGENCIA_PADRAO=1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
   
    private static int SEQUENCIAL=1;
    public Conta_Banco(Cliente cliente){
        this.agencia= Conta_Banco.AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
        this.cliente=cliente;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        
        saldo-=valor;
    }

    @Override
    public void deposistar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta_Banco destino) {
        this.sacar(valor);
        destino.deposistar(valor);
    
    }
    protected void imprimir_comuns(){
        System.out.println("AGENCIA "+this.agencia);
        System.out.println("NUMERO "+this.numero);
        System.out.println("SALDO "+this.saldo);
        System.out.println("Cliente "+this.cliente.getNome());
    }
}
