package Models;

public class Competicao {
    private int dia;
    private int mes;
    private int ano;
    private String competicao;
    private String adversario;
    private int golosNossos;
    private int golosAdversario;

    public Competicao(int dia, int mes, int ano, String competicao, String adversario, int golosNossos, int golosAdversario) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.competicao = competicao;
        this.adversario = adversario;
        this.golosNossos = golosNossos;
        this.golosAdversario = golosAdversario;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getCompeticao() {
        return competicao;
    }

    public String getAdversario() {
        return adversario;
    }

    public int getGolosNossos() {
        return golosNossos;
    }

    public int getGolosAdversario() {
        return golosAdversario;
    }
}
