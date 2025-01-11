package controller;

import java.sql.*;

import conexao.Conexao;

public class Restricoes extends Conexao{

    public String restringir(String tabela,String restricao){
        try{
            if(!restricao.equals("n")){
                Statement stmt = conectar();
                rs = stmt.executeQuery("select * from " + tabela + ";");
                rsmd = rs.getMetaData();
                nDeColun = rsmd.getColumnCount();
                System.out.println("Selecione o alvo do filtro:\n");
                for(int i = 1; i < nDeColun; i++){
                    System.out.print(rsmd.getColumnName(i) + ", ");
                }
                System.out.print(rsmd.getColumnName(nDeColun) + "\n");
                query = " where " + sc.nextLine();
                System.out.print("Valor da restrição: ");
                switch(restricao){
                    case "==":
                        query += " = '" + sc.nextLine() + "';";
                        break;
                    case "!=":
                        
                        query += " <> '" + sc.nextLine() + "';";
                        break;
                    default:
                        System.out.println("Valor invalido");

                }
                return query;
            }
            else{
                return query;
            }
        }
        catch(Exception e){
            return query;
        }
    }
}
