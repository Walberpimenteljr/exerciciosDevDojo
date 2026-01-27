package listadeexercicios.exercicio13.teste;

import listadeexercicios.exercicio13.dominio.Produto;

import java.util.Scanner;


public class ProdutosTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto("Feijão", 100);
        System.out.println("Digite a forma de pagamento: ");
        int metodoDePagamento = scanner.nextInt();
        switch (metodoDePagamento) {
            case 1:
                double pix = produto.getPreco() - produto.getPreco()  * 0.15;
                System.out.println("Você escolheu o método PIX/Avista: " + pix+ " reais");
                break;
            case 2:
                double avistaCartaoCredito = produto.getPreco() - produto.getPreco()  * 0.10;
                System.out.println("Você escolheu o método avista no cartão de credito: " + avistaCartaoCredito+ " reais");
                break;
            case 3:
                double parceladoDuasVezes = produto.getPreco() / 2;
                System.out.println("Você escolheu o parcelamento em duas vezes, valor das parcelas ficará: " + parceladoDuasVezes+ " reais");
                break;
            case 4:
                double parceladoTresVezes = (produto.getPreco() + produto.getPreco() * 0.10);
                System.out.println("Você escolheu o parcelamento em três vezes, valor total: " + parceladoTresVezes + " Juros");
                break;
            default:
                System.out.println("Opçao invalida");
        }
    }
}
