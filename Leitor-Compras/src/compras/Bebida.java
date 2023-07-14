package compras;

public  class Bebida extends Produto {
    private final String tipoBebida;

    public Bebida(String nome, double preco, String tipoBebida) {
        super(nome, preco);
        this.tipoBebida = tipoBebida;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo de Bebida: " + tipoBebida;
    }
}
