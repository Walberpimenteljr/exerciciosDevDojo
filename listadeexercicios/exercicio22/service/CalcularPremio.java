package listadeexercicios.exercicio22.service;

import listadeexercicios.exercicio22.dominion.Jogador;
import listadeexercicios.exercicio22.dominion.Participante;
import listadeexercicios.exercicio22.dominion.Treinador;

public class CalcularPremio {
    public void gerarRelatorioPremiacao(Participante participante) {
        System.out.println("Nome: " + participante.getNome());
        System.out.println("Valor Base: " + participante.getValorBasePremio());
        System.out.println("Valor: " + participante.calcularPremio());
        System.out.println("Tipo: " + participante.getClass().getSimpleName());
        if (participante instanceof Jogador) {
            System.out.println("Gols : " + ((Jogador) participante).getGolsMarcados());
        }
        if (participante instanceof Treinador) {
            System.out.println("Titulos: " + ((Treinador) participante).getTitulos());
        }
    }
}
