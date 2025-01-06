import java.sql.*;
public class Select extends Conexao{
    public void select(String tabela){

        try{
            Statement stmt = conectar();
            rs = stmt.executeQuery("select * from " + tabela + ";");
            rsmd = rs.getMetaData();
            while(rs.next()){
                for(int i = 1; i <= rsmd.getColumnCount(); i++){
                    if(rs.getString(i) != null){
                        System.out.print("| " + rs.getString(i) + " ");
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println("\nErro no Metodo Select\n");
        }
    }
}
