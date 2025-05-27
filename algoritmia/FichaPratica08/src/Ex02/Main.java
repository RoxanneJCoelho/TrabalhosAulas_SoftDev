package Ex02;

public class Main {
    public static void main(String[] args) {
        Edificio margaridas = new Edificio("Margaridas", "Rua das Flores", "Porto", "amarelo", 5, true);
        System.out.println(margaridas.getNome());
        System.out.println(margaridas.getRua());
        System.out.println(margaridas.getCidade());
        System.out.println(margaridas.getCor_fachada());
        System.out.println(margaridas.getNumero_andares());
        System.out.println(margaridas.getGaragem());
        margaridas.setCor_fachada("azul");
        System.out.println(margaridas.getNome());
        System.out.println(margaridas.getRua());
        System.out.println(margaridas.getCidade());
        System.out.println(margaridas.getCor_fachada());
        System.out.println(margaridas.getNumero_andares());
        System.out.println(margaridas.getGaragem());

    }
}
