package listadeexercicios.exercicio21.dominio;

public class Pagamento implements Pagavel {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
