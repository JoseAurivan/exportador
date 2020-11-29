import com.joseaurivan.exportador.Coluna;
import com.joseaurivan.exportador.ExportadorListaProduto;
import com.joseaurivan.exportador.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Executa a aplicação Exportador Simple Factory.
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV", "LG", "132-A", 120));
        produtos.add(new Produto("Notebook", "Asus", "New age", 341));
        produtos.add(new Produto("Smartphone", "Samsung", "Galaxy S10", 214));

        ExportadorListaProduto exportadorPadrao = ExportadorListaProduto.newInstance();
        exportadorPadrao.addNewColuna(Principal::reporEstoque, "Estoque Reposto");

        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        ExportadorListaProduto exportadorMarkdown = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        System.out.println(exportadorMarkdown.exportar(produtos));
    }
    
    
    private static double reporEstoque(Produto produto){
        return produto.getEstoque() * 2;
    }
}
