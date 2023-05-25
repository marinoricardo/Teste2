package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {

    public static String status = "404-not found";

    public Connection getConnection() {
        try {
            String driveName = "com.mysql.jdbc.Driver";
            Class.forName(driveName);

            String serverName = "localhost";
            String mydatabase = "teste2";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String UserName = "root";
            String pass = "";

            return DriverManager.getConnection(url, UserName, pass);

        } catch (ClassNotFoundException e) {
            // throw new RuntimeException(e);
            System.out.println("drive nao encontrado: " + e);
            return null;

        } catch (SQLException e) {
            System.out.println("nao foi possivel conectar a base de dados" + e);
            return null;
            // throw new RuntimeException(e);
        }
    }
}
