import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Luiz: " +  devLuiz.getConteudosInscrito());

        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Luiz: " +  devLuiz.getConteudosInscrito());
        System.out.println("Conteúdos concluídos Luiz: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXP());

        System.out.println("--------------");

        Dev devMaria = new Dev();
        devLuiz.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscrito());

        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscrito());
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());

        }
    }
