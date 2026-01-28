package listadeexercicios.exercicio20.teste;

import listadeexercicios.exercicio20.professor.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor(100, 20);
        Professor p2 = new Professor(85.4, 50);
        p1.calcularSalario();
        p2.calcularSalario();
    }
}
