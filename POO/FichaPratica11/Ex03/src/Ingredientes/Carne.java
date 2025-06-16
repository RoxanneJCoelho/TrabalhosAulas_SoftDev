package Ingredientes;

import Enums.OrigemIngrediente;
import Enums.TipoCarne;
import Enums.UnidadeMedida;

public class Carne extends Topping{
    private TipoCarne tipo;

    public Carne(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem, TipoCarne tipo) {
        super(id, nome, medida, kcalPorMedida, origem);
        this.tipo = tipo;
    }

    @Override
    public void imprimirTipoIngrediente() {
        System.out.println("Isto é uma Carne");
    }
}
