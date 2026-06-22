package operadores_relacionais;

public class ComparandoIDsProdutos {
    public static void main (String [] args) {

        int idProdutoEstoque = 404;
        int idProdutoCarrinho = 404;

        if (idProdutoEstoque == idProdutoCarrinho) {
            System.out.println("O produto do carrinho é o mesmo do estoque. Código: \" + idProdutoEstoque");
        }


    }
}
