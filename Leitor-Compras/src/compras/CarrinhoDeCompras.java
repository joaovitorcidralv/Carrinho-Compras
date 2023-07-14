package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void comprarProduto(Produto produto){
        produto.setComprado(true);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        if (total == 0) {
            throw new Exception("Carrinho vazio, compre produtos!");
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void limparCarrinho() {
        produtos.clear();
    }

}
