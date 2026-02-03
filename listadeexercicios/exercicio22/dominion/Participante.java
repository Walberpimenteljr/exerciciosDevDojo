package listadeexercicios.exercicio22.dominion;

public abstract class Participante implements Premiavel {
    protected String nome;
    protected double valorBasePremio;


    public Participante(String nome, double valorBasePremio) {
        this.nome = nome;
        this.valorBasePremio = valorBasePremio;
    }
    public abstract void mostrarDetalhes();

    public abstract double calcularPremio();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorBasePremio() {
        return valorBasePremio;
    }

    public void setValorBasePremio(double valorBasePremio) {
        this.valorBasePremio = valorBasePremio;
    }


}
