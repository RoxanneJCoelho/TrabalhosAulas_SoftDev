package Ex_09;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario ("Maria", "maria@email.com", "Filosofia", 1500);
        fun1.exibirDados();
        fun1.aumentarSalario(10);
        System.out.println("--------------"); // para dividir o antes e depois
        fun1.exibirDados();
    }
}
