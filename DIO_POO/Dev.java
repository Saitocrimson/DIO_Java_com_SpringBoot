package DIO_POO;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoDev=new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido=new LinkedHashSet<>();
   
    
    public void inscreverBootcamp(Bootcamp campi ){
    this.conteudoDev.addAll(campi.getConteudo());
    campi.getDevsInscritos().add(this);
    
    }
    public void progredir(){
    Optional<Conteudo> conteudo= this.conteudoDev.stream().findFirst();
    if(conteudo.isPresent()){
        this.conteudoConcluido.add(conteudo.get());
        this.conteudoDev.remove(conteudo.get());
    }
    else{
        System.err.println("Nao tem matriculas");
    }
    }
    public double calculaxp(){
    return this.conteudoConcluido.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoDev() {
        return conteudoDev;
    }

    public void setConteudoDev(Set<Conteudo> conteudoDev) {
        this.conteudoDev = conteudoDev;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.conteudoDev);
        hash = 19 * hash + Objects.hashCode(this.conteudoConcluido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudoDev, other.conteudoDev)) {
            return false;
        }
        return Objects.equals(this.conteudoConcluido, other.conteudoConcluido);
    }
    
}
