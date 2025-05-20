package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {

        int numero = 1, somatorio = 0;

        while (numero<=100){
            System.out.println(numero);
            somatorio = somatorio + numero;
            numero = numero + 1;
        }
        System.out.println("Somatorio: " + somatorio);

    }
}
