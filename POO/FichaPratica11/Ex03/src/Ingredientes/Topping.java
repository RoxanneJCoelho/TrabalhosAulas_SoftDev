package Ingredientes;

import Enums.OrigemIngrediente;
import Enums.UnidadeMedida;

public abstract class Topping extends Ingrediente {
    private OrigemIngrediente origem;

    public Topping(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem) {
        super(id, nome, medida, kcalPorMedida);
        this.origem = origem;
    }
}