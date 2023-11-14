package Factory;

import java.sql.Connection;

public class TestConnectionFactory {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = ConnectionFactory.getConnection();
            if (connection != null) {
                System.out.println("Connected successfully! :)");
            } else {
                System.out.println("Connection failed! :(");
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
