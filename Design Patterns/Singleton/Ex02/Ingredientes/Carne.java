package Ex02.Ingredientes;

import Ex02.Enums.TipoCarne;
import Ex02.Enums.UnidadeMedida;
import Ex02.Enums.OrigemIngrediente;

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
