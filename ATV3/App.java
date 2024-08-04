import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

  private static Scanner scanner = new Scanner(System.in);

  public static List<Funcionario> criarFuncionarios() {
    List<Funcionario> funcionarios = new ArrayList<>();

    System.out.println("Digite o número de funcionários a serem cadastrados:");
    int numFuncionarios = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numFuncionarios; i++) {
      System.out.println("Funcionário " + (i + 1));
      
      System.out.print("Nome: ");
      String nome = scanner.nextLine();
      
      System.out.print("Matrícula: ");
      String matricula = scanner.nextLine();
      
      System.out.print("Salário: ");
      float salario = Float.parseFloat(scanner.nextLine());

      Funcionario funcionario = new Funcionario(nome, matricula, salario);
      funcionarios.add(funcionario);
    }                                                            x

    return funcionarios;
  }

  public static List<ItemPedido> criarItensPedido() {
    List<ItemPedido> itensPedido = new ArrayList<>();

    System.out.println("Digite o número de itens de pedido a serem cadastrados:");
    int numItens = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numItens; i++) {
      System.out.println("Item " + (i + 1));
      
      System.out.print("ID do item de pedido: ");
      int id = Integer.parseInt(scanner.nextLine());
      
      System.out.print("ID do produto: ");
      int item = Integer.parseInt(scanner.nextLine());
      
      System.out.print("Quantidade: ");
      int quantidade = Integer.parseInt(scanner.nextLine());
      
      System.out.print("Preço unitário: ");
      float precoUnitario = Float.parseFloat(scanner.nextLine());

      ItemPedido itemPedido = new ItemPedido(id, item, quantidade, precoUnitario);
      itensPedido.add(itemPedido);
    }

    return itensPedido;
  }

  public static List<Loja> criarLojas(List<Funcionario> funcionarios) {
    List<Loja> lojas = new ArrayList<>();

    System.out.println("Digite o número de lojas a serem cadastradas:");
    int numLojas = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numLojas; i++) {
      System.out.println("Loja " + (i + 1));
      
      System.out.print("Nome fantasia: ");
      String nomeFantasia = scanner.nextLine();
      
      System.out.print("CNPJ: ");
      String cnpj = scanner.nextLine();
      
      System.out.print("Valor de mercado: ");
      double valorDeMercado = Double.parseDouble(scanner.nextLine());

      Funcionario funcionario = selecionarFuncionario(funcionarios);
      Loja loja = new Loja(i + 1, nomeFantasia, cnpj, valorDeMercado, funcionario);
      lojas.add(loja);
    }

    return lojas;
  }

  private static Funcionario selecionarFuncionario(List<Funcionario> funcionarios) {
    System.out.println("Selecione um funcionário:");
    for (int i = 0; i < funcionarios.size(); i++) {
      System.out.println((i + 1) + ". " + funcionarios.get(i).getNome());
    }
    int escolha = Integer.parseInt(scanner.nextLine());
    return funcionarios.get(escolha - 1);
  }

  public static Pedido criarPedido(List<ItemPedido> itensPedido) {
    Date dataEmissao = new Date(); // Data atual
    float valorTotal = calcularValorTotal(itensPedido);

        // Supondo que o ID do pedido seja gerado automaticamente, podemos apenas passar -1 por enquanto.
    Pedido pedido = new Pedido(-1, dataEmissao, valorTotal, itensPedido);

    return pedido;
  }

  private static float calcularValorTotal(List<ItemPedido> itensPedido) {
    float total = 0.0f;
    for (ItemPedido item : itensPedido) {
      total += item.getQuantidade() * item.getPrecoUnitario();
    }
    return total;
  }
}
