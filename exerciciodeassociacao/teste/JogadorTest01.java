package exerciciodeassociacao.teste;

import exerciciodeassociacao.dominio.Jogador;
import exerciciodeassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Walber");
        Jogador jogador2 = new Jogador("Clara");
        Jogador jogador3 = new Jogador("Bruno");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador, jogador2, jogador3};
        for (Jogador jogadora : jogadores) {
            time.imprimirJogador();
        }


    }
}
