package listadeexercicios.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoNascimento;
        int anoAtual = 2026;

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();

        int diasTotais = (anoAtual - anoNascimento) * 365;

        int anos = diasTotais / 365;
        int resto = diasTotais % 365;

        int meses = resto / 30;
        int dias = resto % 30;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida.");

        sc.close();
    }
}



