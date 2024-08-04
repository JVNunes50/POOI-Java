import java.util.Scanner;

public class App{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitando informações do imóvel
    System.out.println("Informe a matrícula do imóvel:");
    String matricula = scanner.nextLine();

    System.out.println("Informe o nome do imóvel:");
    String nome = scanner.nextLine();

    System.out.println("Informe o número de meses de atraso no pagamento do imposto:");
    int mesesAtrasos = scanner.nextInt();

    System.out.println("Informe o valor do imposto:");
    float imposto = scanner.nextFloat();

    System.out.println("Informe o valor do imóvel:");
    float valorImovel = scanner.nextFloat();

    // Criando objeto Imovel com os dados fornecidos
    Imovel imovel = new Imovel();
    imovel.matricula = matricula;
    imovel.nome = nome;
    imovel.mesesAtrasos = mesesAtrasos;
    imovel.imposto = imposto;
    imovel.valorImovel = valorImovel;

    // Solicitando informações do município
    System.out.println("Informe a UF do município:");
    String UF = scanner.next();

    System.out.println("Informe o bairro do município:");
    String bairro = scanner.next();

    System.out.println("Informe o CEP do município:");
    int CEP = scanner.nextInt();

    // Criando objeto Município com os dados fornecidos
    Municipio municipio = new Municipio(UF, bairro, CEP);

    // Adicionando o imóvel ao município
    municipio.mun.put(matricula, imovel);

    // Calculando a multa
    double multa = municipio.multar(matricula);
      
    // Exibindo o resultado
    System.out.println("Multa calculada para o imóvel com matrícula " + matricula + ": " + multa);

    scanner.close();
  }
}
