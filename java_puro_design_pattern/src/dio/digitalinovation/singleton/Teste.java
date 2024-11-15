
package dio.digitalinovation.singleton;

import dio.digitalinovation.facade.Facade;
import dio.digitalinovation.strategy.Comportamento;
import dio.digitalinovation.strategy.ComportamentoAgressivo;
import dio.digitalinovation.strategy.ComportamentoDefensivo;
import dio.digitalinovation.strategy.ComportamentoNormal;
import dio.digitalinovation.strategy.Robo_strategy;

public class Teste {
   public static void main(String[] args) {
        /*Singleton
       SingletonLazy lazy= SingletonLazy.getInstancia();
        System.out.println("lazy:"+lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println("lazy:"+lazy);
        
        SingletonEager eager= SingletonEager.getInstancia();
        System.out.println("eager:"+eager);
        eager=SingletonEager.getInstancia();
        System.out.println("eager:"+lazy);
        
        SingletonLazyHolder holder= SingletonLazyHolder.getInstancia();
        System.out.println("lazy holder:"+lazy);
        holder=SingletonLazyHolder.getInstancia();
        System.out.println("lazy holder:"+lazy);
       */
        /*Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();
        Robo_strategy robo= new Robo_strategy();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();*/
        
        Facade facade = new Facade();
        facade.migrarCliente("Puidm", "1234566");
        
        
        
        
    }
}
