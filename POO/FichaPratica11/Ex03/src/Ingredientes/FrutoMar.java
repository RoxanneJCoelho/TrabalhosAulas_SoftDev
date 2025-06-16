package Ingredientes;

import Enums.OrigemIngrediente;
import Enums.TipoFrutosMar;
import Enums.UnidadeMedida;


public class FrutoMar extends Topping{
    private TipoFrutosMar tipo;

    public FrutoMar(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem, TipoFrutosMar tipo) {
        super(id, nome, medida, kcalPorMedida, origem);
        this.tipo = tipo;
    }

    @Override
    public void imprimirTipoIngrediente() {
        System.out.println("Isto é um Fruto do Mar");
    }
}
