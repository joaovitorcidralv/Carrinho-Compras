package compras;

public class Alimento extends Produto{
    private final String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " - Validade: " + dataValidade;
    }
}
