package Ex02.Ingredientes;

import Ex02.Enums.UnidadeMedida;
import Ex02.Enums.TipoBase;

public class Base extends Ingrediente {

    private TipoBase tipo;
    private String descricao;

    public Base(int id, String nome, double kcalPorMedida, TipoBase tipo, String descricao) {
        super(id, nome, UnidadeMedida.GRAMAS, kcalPorMedida);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    @Override
    public void imprimirTipoIngrediente() {
        System.out.println("Isto é uma Base");
    }
}
