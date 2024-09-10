package tecnologias;


import aparelhoTelefonico.AparelhoEletronico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;
import tecnologias.iphone_uml.Iphone_UML;
import tecnologias.ipod.Ipod;

public class Tecnologias {
    public static void main(String[] args) {
        AparelhoEletronico iphoneT =new Iphone_UML();
        NavegadorInternet iphoneN = new Iphone_UML();
        ReprodutorMusical iphoneR =new Iphone_UML();
        ReprodutorMusical ipod=new Ipod();
        System.out.println("Iphone: ");
        System.out.println("--------------musica: ");
        iphoneR.tocar();
        iphoneR.selecionar_Musica("In the end-Linkin Park");
        iphoneR.pausar();
        System.out.println("--------------telefone: ");
        iphoneT.ligar("123456789");
        iphoneT.iniciar_Correio_voz();
        iphoneT.atender();
        System.out.println("-------------navegador: ");
        iphoneN.exibir_Pagina("www.dio.com.br");
        iphoneN.adicionar_Nova_aba();
        iphoneN.atualizar_Pagina();
        System.out.println("--------------------------------------------------");

        System.out.println("Exemplo de implementacao de interface");
        ipod.selecionar_Musica("in the end-Linkin Park");
        
        
        
    }
    
}
