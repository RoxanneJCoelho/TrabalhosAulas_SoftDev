package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor", 25, 1.7);
        Pessoa pessoa2 = new Pessoa("Roxie", 23, 1.5);

        System.out.println("Pessoa 1: " + pessoa1.getNome() + " | Idade: " + pessoa1.getIdade() + " | Altura: " + pessoa1.getAltura());
        System.out.println("Pessoa 2: " + pessoa2.getNome() + " | Idade: " + pessoa2.getIdade() + " | Altura: " + pessoa2.getAltura());

    }
}
