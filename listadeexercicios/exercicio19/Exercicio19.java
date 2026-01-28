package listadeexercicios.exercicio19;

import java.util.Random;

public class Exercicio19 {
    public static void main(String[] args) {
        Random gerador = new Random();
        for (int i = 1; i < 2; i++) {
            System.out.println(gerador.nextInt(100));
        }
    }
}
