package Ex02;

public class TacoBell {
    public Taco criarTaco(String tipo) {
        if (tipo.equalsIgnoreCase("vaca")) {
            return new TacoCarneVaca();
        } else if (tipo.equalsIgnoreCase("frango")) {
            return new TacoFrango();
        } else if (tipo.equalsIgnoreCase("vegetariano")) {
            return new TacoVegetariano();
        } else {
            System.out.println("Tipo de taco desconhecido!");
            return null;
        }
    }
}
