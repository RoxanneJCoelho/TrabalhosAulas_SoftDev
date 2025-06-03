package Ex02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Sara", 24, 911231231, "Sara@gmail.com");
        Pessoa pessoa2 = new Pessoa("Ana", 13, 912231231, "Ana@gmail.com");
        Pessoa pessoa3 = new Pessoa("Maria", 30, 911281231, "Maria@gmail.com");
        Pessoa pessoa4 = new Pessoa("Joana", 79, 911234231, "Joana@gmail.com");
        Pessoa pessoa5 = new Pessoa("Matilde", 22, 911231281, "Matilde@gmail.com");

        Sorteio meuSorteio = new Sorteio("Euromilhoes", 10000);
        meuSorteio.inscreverParticipante(pessoa1);
        meuSorteio.inscreverParticipante(pessoa2);
        meuSorteio.inscreverParticipante(pessoa3);
        meuSorteio.inscreverParticipante(pessoa4);
        meuSorteio.inscreverParticipante(pessoa5);

        meuSorteio.listarParticipantes();

        System.out.println("\n*_*_*_*_*_*_*_*_*_* Vencedor *_*_*_*_*_*_*_*_*_*");
        Pessoa vencedor = meuSorteio.sortearVencedor();
        vencedor.exibirDetalhes();


    }
}
