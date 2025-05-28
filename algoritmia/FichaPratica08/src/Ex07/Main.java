package Ex07;

public class Main {
    public static void main(String[] args) {
        Aluno maria = new Aluno ("Maria", 21, "maria@gmail.com", "Biotecnologia", 15);
        Aluno ricardo = new Aluno("Ricardo", 25, "ricardo@gmail.com", "Engenharia Informática", 7.5);

        maria.situacaoAprovacao();
        ricardo.situacaoAprovacao();
    }


}
