package listadeexercicios.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor para reajuste: ");
        int valor = scanner.nextInt();
        double reajuste = 0.05;
        double total = valor + valor * reajuste;
        System.out.println("Valor com reajuste: "+ total);















        scanner.close();
    }
}
