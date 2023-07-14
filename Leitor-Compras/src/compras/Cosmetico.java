package compras;

public  class Cosmetico extends Produto {
    private final String marcaCosmetico;

    public Cosmetico(String nome, double preco, String marcaCosmetico) {
        super(nome, preco);
        this.marcaCosmetico = marcaCosmetico;
    }

    @Override
    public String toString() {
        return super.toString() + " - Marca: " + marcaCosmetico;
    }
}
