package listadeexercicios.exercicio10.dominio;

public class Pessoa {
    double peso;
    double altura;


    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double CalcularImc() {
        return peso / (altura * altura);
    }

    public void imprime() {
        if (CalcularImc() < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (CalcularImc() > 18.6 && CalcularImc() < 24.9) {
            System.out.println("Peso ideal ");
        } else if (CalcularImc() > 25 && CalcularImc() < 29.9) {
            System.out.println("Levemente acima do peso ");
        } else if (CalcularImc() > 30 && CalcularImc() < 34.9) {
            System.out.println("Obesidade grau 1 ");
        } else if (CalcularImc() > 35 && CalcularImc() < 39.9) {
            System.out.println("Obesidade grau 2 ");
        } else {
            System.out.println("Obesidade grau 3 ");
        }

    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

