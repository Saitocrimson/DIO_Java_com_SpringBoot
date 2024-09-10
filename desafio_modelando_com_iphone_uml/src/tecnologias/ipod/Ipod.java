package tecnologias.ipod;

import reprodutorMusical.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

  @Override
    public void tocar() {
        System.out.println("Tocando a musica no seu ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica no seu ipod");

    }
    @Override
    public void selecionar_Musica(String nome_musica) {
         System.out.println("Selecionado a musica:" +nome_musica+"no seu ipod ");
    }
    
}
