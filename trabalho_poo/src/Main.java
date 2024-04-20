import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto(1, "monitor", 500.0, 5, LocalDate.now());
        produtoDAO.adicionarProduto(produto);
        produtoDAO.atualizarProduto(produto);
        List<Produto> produtos = produtoDAO.listarProdutos();
        produtos.forEach(System.out::println);

        Produto produto2 = new Produto(2, "teclado", 60.0, 10, LocalDate.now());
        produtoDAO.adicionarProduto(produto2);
        produtoDAO.atualizarProduto(produto2);
        produtos = produtoDAO.listarProdutos();
        produtos.forEach(System.out::println);

        Produto produto3 = new Produto(3, "Notebook", 1000.0, 20, LocalDate.now());
        produtoDAO.adicionarProduto(produto3);
        produtoDAO.atualizarProduto(produto3);
        produtos = produtoDAO.listarProdutos();
        produtos.forEach(System.out::println);

        Produto produto4 = new Produto(4, "Headset", 90.0, 30, LocalDate.now());
        produtoDAO.adicionarProduto(produto4);
        produtoDAO.atualizarProduto(produto4);
        produtos = produtoDAO.listarProdutos();
        produtos.forEach(System.out::println);
    }
}