package compras;

public class Produto {
    protected String nome;
    protected double preco;
    protected boolean comprado;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.comprado = false;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
