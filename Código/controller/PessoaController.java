package controller;

import conexao.CRUD;
import view.PessoaView;

public class PessoaController extends CRUD{
    public PessoaView pessoaV = new PessoaView();
    private String PK;
    private String[] valores = new String[12];
    private String[] aux = new String[6];

    public void removerPessoa(){
        pessoaV.deletarPessoa();
        PK = pessoaV.pessoaM.getCPF();
        delete("pessoa",PK);
        }
    public void adicionarPessoa(){
        pessoaV.inserirPessoa();
        valores[0] = pessoaV.pessoaM.getCPF();
        valores[1] = pessoaV.pessoaM.getNome();
        valores[2] = pessoaV.pessoaM.getSobrenome();
        valores[3] = pessoaV.pessoaM.getCEP();
        aux = pessoaV.pessoaM.getEndereco();
        for(int i = 4; i<10;i++){
            valores[i] = aux[i-2];
        }
        valores[10] = pessoaV.pessoaM.getEmail();
        valores[11] = pessoaV.pessoaM.getTelefone();
        inserir("pessoa", valores, 12);
    }
    public void atualizarPessoa(){
        pessoaV.modificarPessoa();
        valores[0] = pessoaV.pessoaM.getCPF();
        valores[1] = pessoaV.pessoaM.getNome();
        valores[2] = pessoaV.pessoaM.getSobrenome();
        valores[3] = pessoaV.pessoaM.getCEP();
        aux = pessoaV.pessoaM.getEndereco();
        for(int i = 4; i<10;i++){
            valores[i] = aux[i-2];
        }
        valores[10] = pessoaV.pessoaM.getEmail();
        valores[11] = pessoaV.pessoaM.getTelefone();
        inserir("pessoa", valores, 12);
    }
    public void visualizarPessoa(){
        select("pessoa");
    }
}