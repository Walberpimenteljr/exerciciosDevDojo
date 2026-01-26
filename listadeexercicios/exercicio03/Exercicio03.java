package listadeexercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o primeiro valor: ");
        int valor1 =  scanner.nextInt();
        System.out.print("Escolha o segundo valor: ");
        int valor2 = scanner.nextInt();
        if (valor1 == valor2) {
            int total =  valor1 + valor2;
            System.out.println("Como os numeros escolhidos são iguais, o valor foi somado. O valor total é: " + total);
        }else{
            int total = valor1 * valor2;
            System.out.println("Como os valores foram diferentes, eles serão multiplicados. Total: "+ total );
        }
    }
}
