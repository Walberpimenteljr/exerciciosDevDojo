package listadeexercicios.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valor = scanner.nextBoolean();
        boolean valor2 = scanner.nextBoolean();

        if(valor == true && valor2 == true){
            System.out.println("Ambos são verdadeiros");
        } else if (!valor && !valor2) {
            System.out.println("Valor falso");
        }else{
            System.out.println("Um valor falso e outro verdadeiro");
        }


        scanner.close();
    }
}
