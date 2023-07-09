package DAO;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConexaoDB {

    private static Connection connection;

    public static void iniciarConexao() {

        try {

            if (connection == null) {
                Properties properties = new Properties();
                InputStream inputStream = ConexaoDB.class.getClassLoader().getResourceAsStream("config.properties");
                properties.load(inputStream);

                String url = properties.getProperty("database.url");
                String username = properties.getProperty("database.username");
                String password = properties.getProperty("database.password");

                connection = DriverManager.getConnection(url, username, password);
                System.out.println("CONEXAO REALIZADA COM SUCESSO");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao tentar realizar uma conexão");
        }

    }

    public static Connection getConnection() {

        return connection;
    }
}
