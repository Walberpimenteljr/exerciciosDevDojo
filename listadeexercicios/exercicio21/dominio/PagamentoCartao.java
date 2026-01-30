package listadeexercicios.exercicio21.dominio;

public class PagamentoCartao extends Pagamento{
    private String bandeira;

    public PagamentoCartao(double valor, String bandeira) {
        super(valor);
        this.bandeira = bandeira;
    }

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando a Taxa do cartão");
        return valor * 0.05;
    }

    public String getBandeira() {
        return bandeira;
    }

}
