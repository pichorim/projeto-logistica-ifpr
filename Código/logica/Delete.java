import java.sql.*;
public class Delete extends Conexao{
    public void delete(String tabela){

        try {
            Statement stmt = conectar();
            rs = stmt.executeQuery("select * from " + tabela + ";");
            rsmd = rs.getMetaData();
            System.out.print(rsmd.getColumnName(1) + ": ");
            stmt.executeUpdate("delete from " + tabela + " where " + rsmd.getColumnName(1) + " = '" + sc.nextLine() + "'");

        } catch (Exception e) {
            System.out.println("\nErro no Metodo Delete\n");
        }
    }
}