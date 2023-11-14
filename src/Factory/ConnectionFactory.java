package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String driver = "org.postgresql.Driver";
    private static final String user = "postgres";
    private static final String password = "1234";

    /**
     * Cria e retorna uma Conexão com Banco de Dados PostgresSQL
     * @return Conexão
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
