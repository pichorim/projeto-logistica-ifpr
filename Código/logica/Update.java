import java.sql.*;
public class Update extends Conexao{
    public void update(String tabela){

        try{
            Statement stmt = conectar();
            query = "update " + tabela + " set ";
            rs = stmt.executeQuery("select * from " + tabela + ";");
            rsmd = rs.getMetaData();
            nDeColun = rsmd.getColumnCount();

            for(int i = 2; i <= nDeColun; i++){
                System.out.print(rsmd.getColumnName(i) + ": ");
                if(i < nDeColun){
                    query = query + rsmd.getColumnName(i) + " = '" + sc.nextLine() + "', ";
                }
                else{
                    query = query + rsmd.getColumnName(i) + " = '" + sc.nextLine() + "' ";
                }
            }
            stmt.executeUpdate(query + "where " + rsmd.getColumnName(1) + " = " + sc.nextLine() + ";");

        }
        catch(Exception e){
            System.out.println("\nErro no Metodo Update\n");
        }
    }
}