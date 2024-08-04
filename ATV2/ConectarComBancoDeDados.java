import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarComBancoDeDados {

  static final String URL = "jdbc:postgresql://localhost:5432/seu_banco_de_dados";
  static final String USUARIO = "seu_usuario";
  static final String SENHA = "sua_senha";

  public static Connection getConnection() {
    Connection con = null;

    try {
      Class.forName("org.postgresql.Driver");

      conexao = DriverManager.getConnection("")
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
      }
  }
}
