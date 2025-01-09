package conexao;

import java.sql.*;
import java.util.Scanner;

public class Conexao {
    
    private Connection con;
    private Statement stmt;
    protected String query;
    protected int nDeColun;
    protected ResultSet rs;
    protected ResultSetMetaData rsmd;
    protected Scanner sc = new Scanner(System.in);

    public Statement conectar() {

        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/correios", "root", "");
                con.createStatement();
                return con.createStatement();
        }

        catch(Exception e){
            System.out.println("\nErro na Conexão\n");
            return stmt;
        }
    }
}