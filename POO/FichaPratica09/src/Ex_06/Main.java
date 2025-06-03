package Ex_06;

public class Main {
    public static void main(String[] args) {
        Atleta pt = new Atleta("João", "Basquetebol", 1.93, 80, "China", 32);
        Atleta br = new Atleta("Cleiton", "Futebol", 1.73, 70, "Brasil", 17);
        Atleta fr = new Atleta("Pierre", "Canoagem", 2.03, 85, "França", 52);
        Atleta en = new Atleta("Peter", "Voleibol", 1.98, 80, "Inglaterra", 26);
        Atleta den = new Atleta("Guilherme", "Andebol", 1.99, 88, "Dinamarca", 92);
        Atleta es = new Atleta("Juan", "Atletismo", 1.71, 77, "México", 4);

        Competicao FinalBraincell = new Competicao("FinalBraincell", "China", 10);
        Competicao SlayQueen = new Competicao("SlayQueen", "México", 20);

        FinalBraincell.inscreverAtleta(pt);
        FinalBraincell.inscreverAtleta(br);
        FinalBraincell.inscreverAtleta(fr);
        SlayQueen.inscreverAtleta(en);
        SlayQueen.inscreverAtleta(den);
        SlayQueen.inscreverAtleta(es);

        System.out.println("--------- Final Braincell ---------");
        FinalBraincell.listarInscritos();

        System.out.println("--------- Slay Queen ---------");
        SlayQueen.listarInscritos();

        FinalBraincell.atletasDaCasa();
        SlayQueen.atletasDaCasa();





    }
}
