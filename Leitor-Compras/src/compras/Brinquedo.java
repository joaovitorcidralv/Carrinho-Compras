package compras;

public class Brinquedo extends Produto {
    private final String faixaEtaria;

    public Brinquedo(String nome, double preco, String faixaEtaria) {
        super(nome, preco);
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public String toString() {
        return super.toString() + " - Faixa Etária: " + faixaEtaria;
    }
}
