package Ex03;

public class Main {
    public static void main(String[] args) {
        Peixe robalo = new Peixe("Dicentrarchus labrax", 9.3, 7.99);
        Peixe bacalhau = new Peixe("Gadus morhua", 30.7, 27.99);
        Marisco camarao = new Marisco("Macrobrachium rosenbergii", 0.26, 15.99);
        Marisco caranguejo = new Marisco("Callinectes sapidus", 2.6, 21.99);
        BarcoPesca Titanic = new BarcoPesca("Titanic", "Amarelo", 1980, 30, 1220, Marca.BENTZ);

        Titanic.pescarPeixe(bacalhau);
        Titanic.pescarPeixe(robalo);
        Titanic.pescarMarisco(camarao);
        Titanic.pescarMarisco(caranguejo);
        Titanic.largarPeixe(0);
        Titanic.largarMarisco(1);
        System.out.println("Total: " + Titanic.calcularTotal() + " euros");
        System.out.println("Salario dos tripulantes: " + Titanic.salarioTripulado());


    }
}
