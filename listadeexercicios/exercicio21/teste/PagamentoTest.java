package listadeexercicios.exercicio21.teste;

import listadeexercicios.exercicio21.dominio.Pagamento;
import listadeexercicios.exercicio21.dominio.PagamentoCartao;
import listadeexercicios.exercicio21.dominio.PagamentoPix;
import listadeexercicios.exercicio21.servico.GerarRelatorio;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao(1000, "Visa");
        Pagamento pagamento2 = new PagamentoPix(3000);
        GerarRelatorio gerarRelatorio = new GerarRelatorio();
        gerarRelatorio.gerarRelatorio(pagamento1);
        System.out.println("------------");
        gerarRelatorio.gerarRelatorio(pagamento2);
    }
}
