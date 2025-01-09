package view;

import java.util.Scanner;
import model.PessoaModel;

public class PessoaView {
    public Scanner sc = new Scanner(System.in);
    public PessoaModel pessoaM = new PessoaModel();
    private int numero;
    private String pais, estado, cidade, bairro, rua;

    public void deletarPessoa(){
        System.out.println("Insira o CPF da pessoa que deseja deletar: ");
        pessoaM.setCPF(sc.nextLine());
    }
    public void inserirPessoa(){
        System.out.println("Insira as informações para adicionar um novo usuario.\nCPF:");
        pessoaM.setCPF(sc.nextLine());
        System.out.println("Nome:");
        pessoaM.setNome(sc.nextLine());
        System.out.println("Sobrenome:");
        pessoaM.setSobrenome(sc.nextLine());
        System.out.println("CEP:");
        pessoaM.setCEP(sc.nextLine());
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
        numero = sc.nextInt(); sc.nextLine();
        pessoaM.setEndereco(pais, estado, cidade, bairro, rua, numero);
        System.out.println("Email:");
        pessoaM.setEmail(sc.nextLine());;
        System.out.println("Telefone:");
        pessoaM.setTelefone(sc.next());
    }
    public void modificarPessoa(){
        System.out.println("Insira as informações para modificar um usuário.\nCPF:");
        pessoaM.setCPF(sc.nextLine());
        System.out.println("Nome:");
        pessoaM.setNome(sc.nextLine());
        System.out.println("Sobrenome:");
        pessoaM.setSobrenome(sc.nextLine());
        System.out.println("CEP:");
        pessoaM.setCEP(sc.nextLine());
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
        numero = sc.nextInt(); sc.nextLine();
        pessoaM.setEndereco(pais, estado, cidade, bairro, rua, numero);
        System.out.println("Email:");
        pessoaM.setEmail(sc.nextLine());;
        System.out.println("Telefone:");
        pessoaM.setTelefone(sc.next());
    }
}