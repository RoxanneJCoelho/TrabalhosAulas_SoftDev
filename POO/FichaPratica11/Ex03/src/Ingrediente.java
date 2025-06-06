import Enums.*;

public class Ingrediente {
    private int id;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double calorias;

    public Ingrediente(int id, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

    public class Base extends Ingrediente{
        BasePizza tipoBase;
        String descricao;

        public Base(int id, String nome, UnidadeMedida unidadeMedida, double calorias, BasePizza tipoBase, String descricao) {
            super(id, nome, unidadeMedida, calorias);
            this.tipoBase = tipoBase;
            this.descricao = descricao;
        }
    }

    public class Topping extends Ingrediente{
        OrigemIngrediente origem;

        public Topping(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem) {
            super(id, nome, unidadeMedida, calorias);
            this.origem = origem;
        }
    }

    public class Queijo extends Topping {
        TipoQueijo tipo;

        public Queijo(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipo) {
            super(id, nome, unidadeMedida, calorias, origem);
            this.tipo = tipo;
        }
    }

    public class FrutosMar extends Topping {
        TipoFrutosMar tipo;

        public FrutosMar(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutosMar tipo) {
            super(id, nome, unidadeMedida, calorias, origem);
            this.tipo = tipo;
        }
    }

    public class Vegetal extends Topping {
        TipoVegetal tipo;

        public Vegetal(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipo) {
            super(id, nome, unidadeMedida, calorias, origem);
            this.tipo = tipo;
        }
    }


}


