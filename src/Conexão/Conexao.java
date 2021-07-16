package Conexão;

import java.sql.*; // importando pacote de linguagem sql
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        final String driver = "com.mysql.jdbc.Driver";
        final String url = "jdbc:mysql://localhost/TWORKPROJECT";

        String usuario = "root";
        String senha = "root";
        
        Class.forName(driver);
        //System.out.println("Conexao estabelecda...");
        JOptionPane.showMessageDialog(null,"Conexão estabelecida.");

        return DriverManager.getConnection(url, usuario, senha);

    }
}
