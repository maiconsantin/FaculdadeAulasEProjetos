package acervo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() throws SQLException {
        try {
            //definição do driver de conexão
            Class.forName("com.mysql.cj.jdbc.Driver");
            //definição dos  parametros de conexão
            return DriverManager.getConnection("jdbc:mysql://localhost/acervo_biblioteca?useTimezone=true&serverTimezone=UTC", "root", "Root");
        } catch (ClassNotFoundException e) {
            throw new SQLDataException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            getConexao();
            System.out.println("Conexão realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Conexão não realizada, verificar log.");
            e.printStackTrace();
        }
    }
}
