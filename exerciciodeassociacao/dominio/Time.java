package exerciciodeassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogador;

    public Time(String nome) {
        this.nome = nome;

    }
    public void imprimirJogador(){
        System.out.println("Nome: " + this.nome);
        for (Jogador jogador : this.jogador) {
            System.out.println("Jogador: " + jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }
}
