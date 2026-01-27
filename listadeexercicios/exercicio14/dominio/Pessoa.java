package listadeexercicios.exercicio14.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        maiorIdade();

    }

    public void maiorIdade(){

        if (idade < 0) {
            System.out.println("Não existe idade negativa");
        } else if (idade < 18) {
            System.out.println("Menor de idade");
        }else  {
            System.out.println("Maior de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
