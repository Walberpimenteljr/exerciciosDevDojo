package listadeexercicios.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int valor = sc.nextInt();
        int sucessor = valor + 1;
        int antecessor = valor - 1;
        if (valor > 0) {
            System.out.println("Sucessor: " + sucessor);
            System.out.println("Antecessor: " + antecessor);
        }else{
            System.out.println("Você colocou um valor negativo, logo ele não pode ser calculado");
        }
    }
}
