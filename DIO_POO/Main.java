package DIO_POO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("ensina a linguagem java.");
        curso1.setCarga_horaria(5);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("ensina POO.");
        curso2.setCarga_horaria(3);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria java");
        mentoria.setDate(LocalDate.now());
        Bootcamp camp = new Bootcamp();
        camp.setNome("Java run");
        camp.setDescricao("Descricao java");
        camp.getConteudo().add(curso1);
        camp.getConteudo().add(curso2);
        camp.getConteudo().add(mentoria);
    
        Dev devPessoa=new Dev();
        devPessoa.setNome("Pudim");
        devPessoa.inscreverBootcamp(camp);
        System.out.println("Conteudo de Pudim "+devPessoa.getConteudoDev());
        System.out.println("Conteudo concluido de Pudim "+devPessoa.getConteudoConcluido());
        System.out.println("Xp;"+devPessoa.calculaxp());

        System.out.println("------------------------------");

        Dev devPessoa2=new Dev();
        devPessoa2.setNome("Caramelo");
        devPessoa2.inscreverBootcamp(camp);
        System.out.println("Conteudo de Caramelo "+devPessoa2.getConteudoDev());
        devPessoa2.progredir();
        System.out.println("Conteudo concluido de Caramelo "+devPessoa2.getConteudoConcluido());
        System.out.println("Conteudo de Caramelo "+devPessoa2.getConteudoDev());
        System.out.println("Xp;"+devPessoa2.calculaxp());
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
      
    }
}
