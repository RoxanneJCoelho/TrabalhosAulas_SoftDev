package Ex02.Ingredientes;

import Ex02.Enums.OrigemIngrediente;
import Ex02.Enums.TipoFrutoMar;
import Ex02.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    private TipoFrutoMar tipo;

    public FrutoMar(int id, String nome, UnidadeMedida medida, double kcalPorMedida, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(id, nome, medida, kcalPorMedida, origem);
        this.tipo = tipo;
    }

    @Override
    public void imprimirTipoIngrediente() {
        System.out.println("Isto é um Fruto do Mar");
    }
}
