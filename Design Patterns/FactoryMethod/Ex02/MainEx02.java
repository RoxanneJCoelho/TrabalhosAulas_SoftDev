package Ex02;

import java.util.Scanner;

public class MainEx02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Que tipo de taco desejas (vaca, frango ou vegetariano)? ");
            String tipo = scanner.nextLine();

            Taco taco = TacoBell.criarTaco(tipo);

            if (taco != null) {
                taco.prepare();
                taco.bake();
                taco.box();
            }
        }
}
