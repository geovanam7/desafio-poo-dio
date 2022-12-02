package br.com.dio.desafio.dominio;
import java.time.LocalDate;
public class mentoria extends conteudo {

    private String titulo;
    private String descricao;
   private LocalDate data;

   public mentoria(){
   }    //construtor

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int calcularXp() {
        return (int) (XP_PADRAO + 23d);



        public String toString() {
        return Integer.parseInt("mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}');
    }
}

