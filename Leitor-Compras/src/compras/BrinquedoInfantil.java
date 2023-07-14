package compras;

public class BrinquedoInfantil extends Brinquedo {

    private final String material;

    public BrinquedoInfantil(String nome, double preco, String faixaEtaria, String material) {
        super(nome, preco, faixaEtaria);
        this.material = material;
    }

    public double desconto() {
        return getPreco() * 0.1;
    }
    @Override
    public String toString() {
        return super.toString() + " - Material: " + material;
    }


}
