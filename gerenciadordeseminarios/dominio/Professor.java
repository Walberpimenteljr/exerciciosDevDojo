package gerenciadordeseminarios.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Aluno[] alunos;




    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void imprime(){
        System.out.println("--------PROFESSOR---------");
        System.out.println("Professor: "+ this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if (seminarios == null) {
            return;
        }
        for (Seminario seminario : seminarios) {
            System.out.println("Curso: "+ seminario.getNome());
            System.out.println(seminario.getLocal().getNome());
        }
        if (alunos == null) {
            return;
        }
        System.out.println("-----ALUNOS-------");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " Idade: "+ aluno.getIdade()) ;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }




}
