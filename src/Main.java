import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.conteudo;
import br.com.dio.desafio.dominio.mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);



        mentoria Mentoria = new mentoria();
        Mentoria.setTitulo ("mentoria java");
        Mentoria.setDescricao ("descricao mentoria java");
        Mentoria.setData (LocalDate.now());  // problema relacionado a variavel data

        System.out.println (curso1);
        System.out.println (curso2);
        System.out.println (Mentoria);


    }
}