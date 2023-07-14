package compras;

public class Vestuario extends Produto{
    private final String tamanho;

    public Vestuario(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tamanho: " + tamanho;
    }
}
