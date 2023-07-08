package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {

    private static Connection connection;

    public static void iniciarConexao() {

        try {

            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mjv_java_school", "postgres", "Service1703@");
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
