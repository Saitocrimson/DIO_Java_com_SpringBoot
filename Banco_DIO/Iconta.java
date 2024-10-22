
package Banco_DIO;

public interface Iconta {
    void sacar(double valor);
    void deposistar(double valor);
    void transferir(double valor, Conta_Banco destino);
    void imprimir();
}
