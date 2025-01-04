import java.sql.*;
import java.util.Scanner;
public class Conexao{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int op = 1, nDeColun;
        String tabela = "pessoa", query;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/correios", "odair", "131619");
            Statement stmt = con.createStatement();
            ResultSet rs;
            ResultSetMetaData rsmd;
            System.out.println("\nConexão estabelecida");

            while(op != 0){
                System.out.println("\nDigite:\n1: Select\n2: Insert\n3: Update\n4: Delete\n");
                op = sc.nextInt(); sc.nextLine();

                switch(op){
                    case 1: //Select
                        rs = stmt.executeQuery("select * from " + tabela + ";");
                        rsmd = rs.getMetaData();
                        while(rs.next()){
                            for(int i = 1; i <= rsmd.getColumnCount(); i++){
                                if(rs.getString(i) != null){
                                    System.out.println(rs.getString(i) + " ");
                                }
                            }
                        }
                        break;

                    case 2: //Insert
                    //dar um jeito dele pergar o null
                        query = "insert into " + tabela + " values (";
                        rs = stmt.executeQuery("select * from " + tabela + ";");
                        rsmd = rs.getMetaData();
                        nDeColun = rsmd.getColumnCount();
                        for(int i = 1; i <= nDeColun; i++){
                            if(i < nDeColun){
                                query = query + "'" + sc.nextLine() + "',";
                            }
                            else{
                                query = query + "'" + sc.nextLine() + "');";
                            }
                        }
                        stmt.executeUpdate(query);
                        break;

                    case 3: //Update
                        query = "update " + tabela + " set ";
                        rs = stmt.executeQuery("select * from " + tabela + ";");
                        rsmd = rs.getMetaData();
                        nDeColun = rsmd.getColumnCount();
                        for(int i = 2; i <= nDeColun; i++){
                            if(i < nDeColun){
                                query = query + rsmd.getColumnName(i) + " = '" + sc.nextLine() + "', ";
                            }
                            else{
                                query = query + rsmd.getColumnName(i) + " = '" + sc.nextLine() + "' ";
                            }
                        }
                        stmt.executeUpdate(query + "where " + rsmd.getColumnName(1) + " = " + sc.nextLine() + ";");
                        break;
                        
                    case 4: //Delete
                        stmt.executeUpdate("delete from " + tabela + " where cpf = '" + sc.nextLine() + "'");
                        break;
                    default:
                        break;
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println("\nErro na Conexão\n");
        }
    }
}
