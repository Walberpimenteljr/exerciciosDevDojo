package listadeexercicios.exercicio13.teste;

import listadeexercicios.exercicio13.dominio.Produto;
import listadeexercicios.exercicio13.dominio.TipoPagamento;


public class ProdutosTest01 {
    public static void main(String[] args) {

        Produto cliente1 = new Produto("Walber", TipoPagamento.PARCELADO_TRESVEZES);
        Produto cliente2 = new Produto("Clara", TipoPagamento.AVISTA_PIX);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente1.getNome() + " terá que pagar: " + TipoPagamento.PARCELADO_TRESVEZES.calcularDesconto(100));
        System.out.println(cliente2.getNome() + " terá que pagar: " + TipoPagamento.AVISTA_PIX.calcularDesconto(100));


    }
}
