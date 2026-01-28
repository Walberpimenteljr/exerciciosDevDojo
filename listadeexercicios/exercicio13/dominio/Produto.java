package listadeexercicios.exercicio13.dominio;

public class Produto {
    private String nome;
    private TipoPagamento tipoPagamento;


    public Produto(String nome, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;

    }

    public Produto() {

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
