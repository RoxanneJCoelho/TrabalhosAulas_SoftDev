package Ex_07;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String email, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getCurso() {
        return curso;
    }

    public double getMedia() {
        return media;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void felizAniversario(){
        this.idade += 1;
    }

    public boolean situacaoAprovacao() {
        if (this.media >= 9.5) {
            System.out.println(this.nome + ": Aprovado");
            return true;
        } else {
            System.out.println(this.nome + ": Reprovado");
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | Idade: " + this.idade + " | " + this.email + " | " + this.curso + " | Média: " + this.media);
    }
}
