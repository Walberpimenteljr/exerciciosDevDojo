package listadeexercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = ler.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = ler.nextInt();
        int total = b + a;
        System.out.println("Resultado de "+ a +" + "+ b +" = " + total);
        if (total < c){
            System.out.println("O resultado de A + B é menor que o número C que é: " + c);
        }


    }
}

