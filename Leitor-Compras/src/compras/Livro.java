package compras;

public class Livro extends Produto {
    private final String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autor: " + autor;
    }
}
