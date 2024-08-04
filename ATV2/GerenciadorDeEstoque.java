import org.src.model.Produto;

import java.math.BigDecimal;
import java.util.Scanner;

public class GerenciadorDeEstoque {

  public static Produto receberCadastroDeEstoque(){

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o nome do produto: ");
    String nomeProduto = scanner.nextLine();

    System.out.println("Digite a quantidade em estoque do produto: ");
    Integer quantidadeEmEstoque = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o preço unitário de custo do produto:");
    BigDecimal precoUnitarioDeCusto = scanner.nextBigDecimal();
    scanner.nextLine();

    System.out.println("Digite a quantidade vendida do produto: ");
    Integer quantidadeVendida = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o preço unitário de venda do produto:");
    BigDecimal precoUnitarioDeVenda = scanner.nextBigDecimal();

    return new Produto.Builder().
      nome(nomeProduto).
      quantidadeEmEstoque(quantidadeEmEstoque).
      precoUnitarioDeCusto(precoUnitarioDeCusto).
      quantidadeVendida(quantidadeVendida).
      precoUnitarioDeVenda(precoUnitarioDeVenda).
      build();
  }

  public static boolean validadorDeCadastro(Produto produto) {

    return produto.getPrecoUnitarioDeCusto().compareTo(BigDecimal.ZERO) > 0 && produto.getPrecoUnitarioDeVenda().compareTo(BigDecimal.ZERO) > 0 && produto.getQuantidadeEmEstoque() >= 0;

  }

  public static void cadastrarProduto() {

    Produto produto = receberCadastroDeEstoque();

    boolean produtoValidado = validadorDeCadastro(produto);

    if (produtoValidado) {

      System.out.println("Produto cadastrado com sucesso!");

    } else {
        System.out.println("Erro ao cadastrar produto! Tente novamente com o valor e quantidade corretos.");
      }
  }
}
