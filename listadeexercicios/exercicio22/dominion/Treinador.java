package listadeexercicios.exercicio22.dominion;

public class Treinador extends Participante {
    private int titulos;

    public Treinador(String nome, double valorBasePremio, int titulos) {
        super(nome, valorBasePremio);
        this.titulos = titulos;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Tipo: Treinador");
        System.out.println("Titulos: " +  this.titulos);
    }

    @Override
    public double calcularPremio() {
        return valorBasePremio + (titulos * 1000);
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
}
