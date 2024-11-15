
package dio.digitalinovation.strategy;

public class Robo_strategy {
    private Comportamento comportamento;
    public void setComportamento(Comportamento comportamento){
        this.comportamento=comportamento;
    }
    public void mover(){
        comportamento.mover();
    }
}
