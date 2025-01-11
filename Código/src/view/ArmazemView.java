package view;

import java.util.Scanner;
import model.ArmazemModel;

public class ArmazemView {
    public Scanner sc = new Scanner(System.in);
    public ArmazemModel armazemM = new ArmazemModel();
    private int PK, numero;
    private String pais, estado, cidade, bairro, rua;

    public void deletarArmazem(){
        System.out.println("Insira o Código do armazém que deseja deletar: ");
        PK = sc.nextInt();sc.nextLine();
        armazemM.setCodigoArmazem(PK);
        
    }
    
    public void inserirArmazem(){
        System.out.println("Insira as informações para adicionar um armazém novo.\nCódigo do armazém:");
        armazemM.setCodigoArmazem(sc.nextInt());sc.nextLine();
        System.out.println("CEP:");
        armazemM.setCEP(sc.nextLine());
        System.out.println("Pais:");
        pais = sc.nextLine();
        System.out.println("Estado:");
        estado = sc.nextLine();
        System.out.println("Cidade:");
        cidade = sc.nextLine();
        System.out.println("Bairro:");
        bairro = sc.nextLine();
        System.out.println("Rua:");
        rua = sc.nextLine();
        System.out.println("Número:");
        numero = sc.nextInt();sc.nextLine();
        armazemM.setEndereco(pais, estado, cidade, bairro, rua, numero);
    }

    public void modificarArmazem(){
        System.out.println("Insira as informações para editar um armazém:\nCódigo do armazém:");
        PK = sc.nextInt();sc.nextLine();
        armazemM.setCodigoArmazem(PK);
        System.out.println("CEP:");
        armazemM.setCEP(sc.nextLine());
        System.out.println("Pais:");
        pais = sc.nextLine();
        System.out.println("Estado:");
        estado = sc.nextLine();
        System.out.println("Cidade:");
        cidade = sc.nextLine();
        System.out.println("Bairro:");
        bairro = sc.nextLine();
        System.out.println("Rua:");
        rua = sc.nextLine();
        System.out.println("Número:");
        numero = sc.nextInt();sc.nextLine();
        armazemM.setEndereco(pais, estado, cidade, bairro, rua, numero);
    }
}