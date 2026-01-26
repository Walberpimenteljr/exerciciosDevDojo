package listadeexercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Envie um número");
        int numero = scanner.nextInt();
        if(numero % 2 == 0 && numero >= 0){
            System.out.println("O numero escolhido é PAR e ele é positivo.");
        } else if (numero % 2 != 0 && numero >= 0) {
            System.out.println("Numero é impar e positivo");
        }else {
            System.out.println("O número é negativo");
        }

    }
}
