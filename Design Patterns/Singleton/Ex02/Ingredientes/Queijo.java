package Ex02.Ingredientes;

import Ex02.Enums.OrigemIngrediente;
import Ex02.Enums.TipoQueijo;
import Ex02.Enums.UnidadeMedida;

public class Queijo extends Topping {
    private TipoQueijo tipo;

    public Queijo(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem, TipoQueijo tipo) {
        super(id, nome, medida, kcalPorMedida, origem);
        this.tipo = tipo;
    }

    @Override
    public void imprimirTipoIngrediente() {
        System.out.println("Isto é um Queijo");
    }
}
