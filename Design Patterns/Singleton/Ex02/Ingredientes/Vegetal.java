package Ex02.Ingredientes;

import Ex02.Enums.OrigemIngrediente;
import Ex02.Enums.TipoVegetal;
import Ex02.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipo;

    public Vegetal(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem, TipoVegetal tipo) {
        super(id, nome, medida, kcalPorMedida, origem);
        this.tipo = tipo;
    }

    @Override
    public void imprimirTipoIngrediente() {
        System.out.println("Isto é um Vegetal");
    }
}
