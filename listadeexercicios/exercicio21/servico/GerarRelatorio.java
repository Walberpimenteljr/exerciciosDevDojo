package listadeexercicios.exercicio21.servico;

import listadeexercicios.exercicio21.dominio.Pagamento;
import listadeexercicios.exercicio21.dominio.PagamentoCartao;

public class GerarRelatorio {
    public void gerarRelatorio(Pagamento pagamento) {

        System.out.println("Sistema de pagamentos");
        System.out.println("Valor: " + pagamento.getValor());
        System.out.println("Taxa: " + pagamento.calcularTaxa());
        if (pagamento instanceof PagamentoCartao){
            System.out.println("Bandeira: " + ((PagamentoCartao) pagamento).getBandeira());
        }
    }
}
