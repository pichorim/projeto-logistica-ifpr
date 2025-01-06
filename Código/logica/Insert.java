import java.sql.*;
public class Insert extends Conexao{
    public void insert(String tabela){

        try{
            Statement stmt = conectar();
            query = "insert into " + tabela + " values (";
            rs = stmt.executeQuery("select * from " + tabela + ";");
            rsmd = rs.getMetaData();
            nDeColun = rsmd.getColumnCount();

            for(int i = 1; i <= nDeColun; i++){
                System.out.print(rsmd.getColumnName(i) + ": ");
                if(i < nDeColun){
                    query = query + "'" + sc.nextLine() + "',";
                }
                else{
                    query = query + "'" + sc.nextLine() + "');";
                }
            }
            stmt.executeUpdate(query);
        }

        catch(Exception e){
            System.out.println("\nErro no Metodo Insert\n");
        }
    }
}