package br.com.dio.desafio.dominio;

 import java.util.LinkedHashSet;
        import java.util.Optional;
        import java.util.Set;

public class Dev {

    private String nome;
    private Set<conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(BootCamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    };
    private double calcularTotalXp(){
        return this.conteudosConcluidos.stream()
                .mapToDouble(conteudo::calculoXp)
                .sum();
    }
    public void progredir(){
        Optional<conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
            System.out.println("Você Progrediu!\nSeu XP até o momento: " + this.calcularTotalXp() + "\n");

        }else{
            System.out.println("Você não está matriculado em nenhum conteúdo.");
        }
    };

    @Override
    public String toString() {
        return "\nDev{" +
                "\nnome='" + nome + '\'' +
                ",\nconteudosIncritos=" + conteudosIncritos +
                ",\nconteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}


