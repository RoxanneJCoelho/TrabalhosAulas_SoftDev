package Ex01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Roxie", 25, 1.54);
        System.out.println(pessoa1.getNome());
        pessoa1.setIdade(50);
        System.out.println(pessoa1.getIdade());
    }
}