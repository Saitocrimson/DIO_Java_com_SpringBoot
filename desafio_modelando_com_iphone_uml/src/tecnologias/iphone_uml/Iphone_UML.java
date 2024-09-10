package tecnologias.iphone_uml;
import aparelhoTelefonico.AparelhoEletronico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone_UML implements ReprodutorMusical, AparelhoEletronico,NavegadorInternet {
    public static void main(String[] args) {
        // TODO code application logic here
    }
//musica
    @Override
    public void tocar() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");

    }
    @Override
    public void selecionar_Musica(String nome_musica) {
         System.out.println("Selecionado a msuica:"+nome_musica);

    }
  
//telefone
    @Override
    public void atender() {
         System.out.println("Atendendo a chamada");

    }

    @Override
    public void iniciar_Correio_voz() {
         System.out.println("Gravando a mensagem....");

    }

    @Override
    public void ligar(String numero) {
        System.out.println(" Linagdo para "+numero);

    }
//internet
    @Override
    public void adicionar_Nova_aba() {
         System.out.println("+++ Adicionando nova aba +++");

    }

    @Override
    public void atualizar_Pagina() {
         System.out.println("Atualizando pagina, aguarde");

    }

    @Override
    public void exibir_Pagina(String url) {
         System.out.println("URL:"+url);

    }
    
}
