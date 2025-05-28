package Ex03;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar um Animal
        String[] alimentosLeao = {"carne", "frango", "peixe"};
        Animal leao = new Animal("Simba", "Leão", "África do Sul", 190.0, alimentosLeao, Animal.ClasseReinoAnimal.MAMIFERO);

        // b) O animal faz barulho
        leao.fazerBarulho();

        // c) Alimentar com algo que não gosta
        double pesoAntes = leao.getPeso();
        leao.comer("banana", 300); // 300g
        double pesoDepois = leao.getPeso();
        System.out.printf("Peso antes: %.2f kg, Peso depois: %.2f kg%n", pesoAntes, pesoDepois);

        // d) Alimentar com algo que ele gosta
        leao.comer("carne", 1000); // 1kg
        System.out.printf("Peso atual: %.2f kg%n", leao.getPeso());
    }
}

