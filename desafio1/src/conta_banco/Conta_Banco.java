
package conta_banco;
import java.util.Scanner;
/*IDE: apache netbeans*/
public class Conta_Banco {

    public static void main(String[] args) {
      Scanner escreve = new Scanner(System.in);
      int numero;
      String agencia;
      String cliente_nome;
      double saldo;
      System.out.println("Digite o numero da agencia");
      numero=escreve.nextInt();
      System.out.println("Digite a  agencia");
      agencia=escreve.next();
      System.out.println("Digite o nome do cliente");
      cliente_nome=escreve.next();
      System.out.println("Digite o saldo");
      saldo=escreve.nextDouble();
      System.out.println("Olá "+cliente_nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
      
      
      
      
      
      
      
    }
    
}
