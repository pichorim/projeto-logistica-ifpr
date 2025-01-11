package controller;

import conexao.Conexao;

public class Operacao extends Conexao{
    public ArmazemController armazemC = new ArmazemController();
    public PessoaController pessoaC = new PessoaController();
    public EncomendaController encomendaC = new EncomendaController();
    private String tabela;
    private int op;

    public void operacao(){
        System.out.println("\nDigite:\n1: Select\n2: Insert\n3: Update\n4: Delete\n0: Fechar");
        op = sc.nextInt(); sc.nextLine();
        while(op != 0){
            
            System.out.println("\nEscolha a tabela (Encomenda, Pessoa ou Armazem):\n");
            tabela = sc.nextLine();
            switch (op) {
                case 1:
                switch (tabela.toLowerCase()) {
                    case "armazem":
                        armazemC.visualizarArmazem();
                        break;
                    case "pessoa":
                        pessoaC.visualizarPessoa();
                        break;
                    case "encomenda":
                        encomendaC.visualizarEncomenda();
                        break;
                    default:
                        System.out.println("\nTabela inexistente\n");
                        break;
                }
                break;
                case 2:
                    switch (tabela.toLowerCase()) {
                        case "armazem":
                            armazemC.adicionarArmazem();
                            break;
                        case "pessoa":
                            pessoaC.adicionarPessoa();
                            break;
                        case "encomenda":
                            encomendaC.adicionarEncomenda();
                            break;
                        default:
                            System.out.println("\nTabela inexistente\n");
                            break;
                    }
                    break;
                case 3:
                    switch (tabela.toLowerCase()) {
                        case "armazem":
                            armazemC.atualizarArmazem();
                            break;
                        case "pessoa":
                            pessoaC.atualizarPessoa();
                            break;
                        case "encomenda":
                            encomendaC.atualizarEncomenda();
                            break;
                        default:
                            System.out.println("\nTabela inexistente\n");
                            break;
                    }
                    break;
                case 4:
                    switch (tabela.toLowerCase()) {
                        case "armazem":
                            armazemC.removerArmazem();
                            break;
                        case "pessoa":
                            pessoaC.removerPessoa();
                            break;
                        case "encomenda":
                            encomendaC.removerEncomenda();
                            break;
                        default:
                            System.out.println("\nTabela inexistente\n");
                            break;
                    }
                    break;
                default:
                    System.out.print("\nValor invalido\n");;
                    break;
            }
            System.out.println("\nDigite:\n1: Select\n2: Insert\n3: Update\n4: Delete\n0: Fechar");
            op = sc.nextInt(); sc.nextLine();
        }
        sc.close();
    }
}