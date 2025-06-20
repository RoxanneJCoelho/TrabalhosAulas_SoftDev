package Ex02.Ingredientes;

import Ex02.Enums.OrigemIngrediente;
import Ex02.Enums.UnidadeMedida;

public abstract class Topping extends Ingrediente {
    private OrigemIngrediente origem;

    public Topping(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem) {
        super(id, nome, medida, kcalPorMedida);
        this.origem = origem;
    }
}
