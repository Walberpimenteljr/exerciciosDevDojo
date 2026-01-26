package gerenciadordeseminarios.test;

import gerenciadordeseminarios.dominio.Aluno;
import gerenciadordeseminarios.dominio.Local;
import gerenciadordeseminarios.dominio.Professor;
import gerenciadordeseminarios.dominio.Seminario;

public class SeminariosTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Murajuba");
        Aluno aluno = new Aluno("Walber", 30);
        Aluno aluno2 = new Aluno("Clara", 21);
        Professor professor = new Professor("Bruno", "Especialista em Java");
        Aluno[] alunos = {aluno, aluno2};

        Seminario seminarios = new Seminario("Curso de Java", alunos, local);


        Seminario[] seminarioss = {seminarios};

        professor.setAlunos(alunos);
        professor.setSeminarios(seminarioss);
        professor.imprime();



    }

}
