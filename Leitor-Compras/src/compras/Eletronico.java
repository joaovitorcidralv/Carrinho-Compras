package compras;

public class Eletronico extends Produto{
    private final String marca;

    public Eletronico(String nome,double preco,String marca){
        super(nome, preco);
        this.marca=marca;
    }

    @Override
    public String toString() {
        return marca + " " + super.toString();
    }
}
