package view;

import java.util.Scanner;
import conexao.CRUD;
import model.EncomendaModel;

public class EncomendaView extends CRUD{
    public Scanner sc = new Scanner(System.in);
    public EncomendaModel encomendaM = new EncomendaModel();
    private String PK;

    public void deletarEncomenda(){
        System.out.println("Insira o Código da encomenda que deseja deletar: ");
        PK = sc.nextLine();
        encomendaM.setCodigoRastreio(PK);
    }

    public void inserirEncomenda(){
        System.out.println("Insira as informações para adicionar uma encomenda novo.\nCódigo de rastreio:");
        encomendaM.setCodigoRastreio(sc.nextLine());
        System.out.println("Quantidade:");
        encomendaM.setQuantidade(sc.nextInt());sc.nextLine();
        System.out.println("Tamanho:");
        encomendaM.setTamanho(sc.nextInt());sc.nextLine();
        System.out.println("Valor:");
        encomendaM.setValor(sc.nextDouble());sc.nextLine();
        System.out.println("Peso:");
        encomendaM.setPeso(sc.nextDouble());sc.nextLine();
        System.out.println("CPF do remetente:");
        encomendaM.setRemetenteCPF(sc.nextLine());
        System.out.println("CPF do destinatario:");
        encomendaM.setDestinatarioCPF(sc.nextLine());
        System.out.println("Código da Unidade Postal:");
        encomendaM.setUnidadePostal(sc.nextInt());sc.nextLine();
        System.out.println("Código do armazém:");
        encomendaM.setCodigoArmazem(sc.nextInt());sc.nextLine();
        System.out.println("Número do corredor:");
        encomendaM.setNumDoCorredor(sc.nextInt());sc.nextLine();
        System.out.println("Número da prateleira:");
        encomendaM.setNumDaPrateleira(sc.nextInt());sc.nextLine();

    }

    public void modificarEncomenda(){
        System.out.println("Insira as informações para editar uma encomenda.\nCódigo de rastreio:");
        encomendaM.setCodigoRastreio(sc.nextLine());
        System.out.println("Quantidade:");
        encomendaM.setQuantidade(sc.nextInt());sc.nextLine();
        System.out.println("Tamanho:");
        encomendaM.setTamanho(sc.nextInt());sc.nextLine();
        System.out.println("Valor:");
        encomendaM.setValor(sc.nextDouble());sc.nextLine();
        System.out.println("Peso:");
        encomendaM.setPeso(sc.nextDouble());sc.nextLine();
        System.out.println("CPF do remetente:");
        encomendaM.setRemetenteCPF(sc.nextLine());
        System.out.println("CPF do destinatario:");
        encomendaM.setDestinatarioCPF(sc.nextLine());
        System.out.println("Código da Unidade Postal:");
        encomendaM.setUnidadePostal(sc.nextInt());sc.nextLine();
        System.out.println("Código do armazém:");
        encomendaM.setCodigoArmazem(sc.nextInt());sc.nextLine();
        System.out.println("Número do corredor:");
        encomendaM.setNumDoCorredor(sc.nextInt());sc.nextLine();
        System.out.println("Número da prateleira:");
        encomendaM.setNumDaPrateleira(sc.nextInt());sc.nextLine();

    }
}
