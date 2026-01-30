package listadeexercicios.exercicio21.dominio;

public class PagamentoPix extends Pagamento{


    public PagamentoPix(double valor, double valor1) {
        super(valor);
        this.valor = valor1;
    }

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Sem cobranças adicionais por pagamento pelo PIX.");
        return valor;
    }
}
