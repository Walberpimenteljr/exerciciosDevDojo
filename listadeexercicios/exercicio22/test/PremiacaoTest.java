package listadeexercicios.exercicio22.test;

import listadeexercicios.exercicio22.dominion.Jogador;
import listadeexercicios.exercicio22.dominion.Participante;
import listadeexercicios.exercicio22.dominion.Treinador;
import listadeexercicios.exercicio22.service.CalcularPremio;

public class PremiacaoTest {
    public static void main(String[] args) {
        Participante participante = new Jogador("Walber", 2000, 500);
        Participante participante2 = new Treinador("Clara", 2000, 10);
        CalcularPremio calcularPremio = new CalcularPremio();
        calcularPremio.gerarRelatorioPremiacao(participante);
        System.out.println("--------------------------");
        calcularPremio.gerarRelatorioPremiacao(participante2);
    }
}
