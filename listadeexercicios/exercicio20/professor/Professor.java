package listadeexercicios.exercicio20.professor;

public class Professor {
    double valorDaHoraAula;
    int numeroDeAulas;
    double descontoInss = 0.11;

    public Professor(double valorDaHoraAula, int numeroDeAulas) {
        this.valorDaHoraAula = valorDaHoraAula;
        this.numeroDeAulas = numeroDeAulas;

    }
    public void calcularSalario() {
        double salarioBruto = this.valorDaHoraAula * this.numeroDeAulas;
        double valorDesconto = salarioBruto * this.descontoInss;
        double salarioLiquido = salarioBruto - valorDesconto;
        System.out.println("Salário Líquido: " + salarioLiquido);
    }



}
