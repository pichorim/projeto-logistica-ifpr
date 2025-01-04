import java.sql.*;
import java.util.Scanner;
public class Backup{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int op=1,CPF,CEP,num,telefone,pK;
        String priNome,sobrenome,pais,uF,cidade,bairro,rua,email,tabela="Pessoa",insert;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CORREIOS","odair","131619");
            Statement stmt=con.createStatement();
            ResultSet rs;
            System.out.println("\nConexão estabelecida\nDigite:\n1: Select\n2: Insert\n3: Update\n4: Delete\n");

            while(op!=0){
                op=sc.nextInt();
                switch(op){
                    case 1: //Select
                        rs=stmt.executeQuery("select * from "+tabela+";");
                        ResultSetMetaData rsmd = rs.getMetaData();
                        int numDeCol = rsmd.getColumnCount();
                        while(rs.next()){
                            for(int i =1;i<=numDeCol;i++){
                                if(rs.getString(i)!=null){
                                    System.out.println(rs.getString(i)+" ");
                                }
                            }
                        }
                        break;
                    case 2: //Insert
                    //dar um jeito dele pergar o null
                        CPF = sc.nextInt();sc.nextLine();
                        priNome = sc.nextLine();
                        sobrenome = sc.nextLine();
                        CEP = sc.nextInt();sc.nextLine();
                        pais = sc.nextLine();
                        uF = sc.nextLine();
                        cidade = sc.nextLine();
                        bairro = sc.nextLine();
                        rua = sc.nextLine();
                        num = sc.nextInt();sc.nextLine();
                        email = sc.nextLine();
                        telefone = sc.nextInt();sc.nextLine();
                        try (PreparedStatement statement = con.prepareStatement("""
                            INSERT INTO Pessoa
                            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                        """)) {
                        
                        statement.setInt(1, CPF);
                        statement.setString(2, priNome);
                        statement.setString(3, sobrenome);
                        statement.setInt(4, CEP);
                        statement.setString(5, pais);
                        statement.setString(6, uF);
                        statement.setString(7, cidade);
                        statement.setString(8, bairro);
                        statement.setString(9, rua);
                        statement.setInt(10, num);
                        statement.setString(11, email);
                        statement.setInt(12, telefone);
                        int rowsInserted = statement.executeUpdate();
                        }
                        break;
                    case 3: //Update
                        CPF = sc.nextInt();sc.nextLine();
                        priNome = sc.nextLine();
                        sobrenome = sc.nextLine();
                        CEP = sc.nextInt();sc.nextLine();
                        pais = sc.nextLine();
                        uF = sc.nextLine();
                        cidade = sc.nextLine();
                        bairro = sc.nextLine();
                        rua = sc.nextLine();
                        num = sc.nextInt();sc.nextLine();
                        email = sc.nextLine();
                        telefone = sc.nextInt();sc.nextLine();
                        try (PreparedStatement statement = con.prepareStatement("""
                            UPDATE Pessoa
                            SET CPF = ?, PrimeiroNome = ?, Sobrenome = ?, CEP = ?, Pais = ?, UF = ?, Cidade = ?, Bairro = ?, Rua = ?, Numero = ?, Email = ?, Telefone = ?
                            WHERE CPF = ?
                        """)) {
                        statement.setInt(1, CPF);
                        statement.setString(2, priNome);
                        statement.setString(3, sobrenome);
                        statement.setInt(4, CEP);
                        statement.setString(5, pais);
                        statement.setString(6, uF);
                        statement.setString(7, cidade);
                        statement.setString(8, bairro);
                        statement.setString(9, rua);
                        statement.setInt(10, num);
                        statement.setString(11, email);
                        statement.setInt(12, telefone);
                        int rowsUpdated = statement.executeUpdate();
                        }
                        break;
                    case 4: //Delete
                        CPF = sc.nextInt();sc.nextLine();
                        stmt.executeUpdate("delete from "+tabela+" where CPF ="+CPF+";");
                        break;
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}