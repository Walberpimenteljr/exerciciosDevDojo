package listadeexercicios.exercicio09;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os três valores: ");
        int[] valores = {34, 10, 20};
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] < valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(valores));



    }
}
