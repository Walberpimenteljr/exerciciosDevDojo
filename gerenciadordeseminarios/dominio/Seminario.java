package gerenciadordeseminarios.dominio;

public class Seminario {
    private String nome;
    private Aluno[] aluno;
    private Professor professor;
    private Local local;


    public Seminario(String nome) {
        this.nome = nome;
    }

    public Seminario(String nome, Aluno[] aluno, Professor professor) {
        this.nome = nome;
        this.aluno = aluno;
        this.professor = professor;
    }

    public Seminario(String nome, Aluno[] aluno, Local local) {
        this.nome = nome;
        this.aluno = aluno;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
