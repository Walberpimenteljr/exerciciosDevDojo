package listadeexercicios.exercicio12;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        double nota1 = scanner.nextInt();
        System.out.println("Digite sua segunda nota");
        double nota2 = scanner.nextInt();
        System.out.println("Digite sua terceira nota");
        double nota3 = scanner.nextInt();
        System.out.println("Digite sua quarta nota");
        double nota4 = scanner.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("média "+ media);
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }

    }
}
