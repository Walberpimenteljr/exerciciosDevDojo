package listadeexercicios.exercicio22.dominion;

public class Jogador extends Participante {
    private int golsMarcados;


    public Jogador(String nome, double valorBasePremio, int golsMarcados) {
        super(nome, valorBasePremio);
        this.golsMarcados = golsMarcados;
    }

    @Override
    public double calcularPremio() {
        return valorBasePremio + (golsMarcados * 100);
    }


    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
}
