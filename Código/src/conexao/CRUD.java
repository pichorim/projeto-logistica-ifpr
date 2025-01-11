package conexao;

import java.sql.*;
import controller.Restricoes;

public class CRUD extends Conexao{
    String aux;

    public void delete(String tabela,String valorDaColuna){

        try {
            Statement stmt = conectar();
            rs = stmt.executeQuery("select * from " + tabela + ";");
            rsmd = rs.getMetaData();
            stmt.executeUpdate("delete from " + tabela + " where " + rsmd.getColumnName(1) + " = '" + valorDaColuna + "'");

        } catch (Exception e) {
            System.out.println("\nErro no Metodo Delete\n");
        }
    }

    public void inserir(String tabela, String[] valoresDasColunas, int numDeAtributos){
        try{
            Statement stmt = conectar();
            query = "insert into " + tabela + " values (";

            for(int i = 0; i < numDeAtributos; i++){
                if(i < numDeAtributos - 1){
                    query = query + "'" + valoresDasColunas[i] + "',";
                }
                else{
                    query = query + "'" + valoresDasColunas[i] + "');";
                }
            }
            stmt.executeUpdate(query);
        }

        catch(Exception e){
            System.out.println("\nErro no Metodo Insert\n");
        }
    }

   
    public void update(String tabela, String[] valoresDasColunas, int numDeAtributos){

        try{
            Statement stmt = conectar();
            rs = stmt.executeQuery("select * from " + tabela + ";");
            rsmd = rs.getMetaData();
            nDeColun = rsmd.getColumnCount();
            query = "update " + tabela + " set ";

            for(int i = 1; i < nDeColun; i++){
                if(i < nDeColun-1){
                    query = query + rsmd.getColumnName(i+1) + " = '" + valoresDasColunas[i] + "', ";
                }
                else{
                    query = query + rsmd.getColumnName(i+1) + " = '" + valoresDasColunas[i] + "' ";
                }
            }
            stmt.executeUpdate(query + "where " + rsmd.getColumnName(1) + " = '" + valoresDasColunas[0] + "';");

        }
        catch(Exception e){
            System.out.println("\nErro no Metodo Update\n");
        }
    } 
    public void select(String tabela){

        try{
            Statement stmt = conectar();
            Restricoes rest = new Restricoes();
            query = "select * from " + tabela;
            System.out.print("Tipo da restrição, digite:\n== para igualdade, != para desigualdade ou n para nenhuma restrição\n");
            aux = rest.restringir(tabela,sc.nextLine());
            if (aux != null) {
                query += aux;
            }
            rs = stmt.executeQuery(query);
            rsmd = rs.getMetaData();
            while(rs.next()){
                for(int i = 1; i <= rsmd.getColumnCount(); i++){
                    System.out.print("| " + rs.getString(i) + " ");
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println("\nErro no Metodo Select\n");
        }
    }
}