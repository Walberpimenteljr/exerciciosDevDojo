package listadeexercicios.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinino = 1293;
        System.out.println("Qual é seu salário? ");
        double salarioUsuario = sc.nextDouble();
        double salariosMinimos = salarioUsuario/salarioMinino;
        System.out.printf("Você recebe %.0f %s", salariosMinimos, " Salarios minimos");

    }
}
