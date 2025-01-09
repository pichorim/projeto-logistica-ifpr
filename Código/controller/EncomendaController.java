package controller;

import conexao.CRUD;
import view.EncomendaView;

public class EncomendaController extends CRUD{
    public EncomendaView encomendaV = new EncomendaView();
    private String PK;
    private String[] valores = new String[11];

    public void removerEncomenda(){
        encomendaV.deletarEncomenda();
        PK = encomendaV.encomendaM.getCodigoRastreio();
        delete("encomenda",PK);
    }
    public void adicionarEncomenda(){
        encomendaV.inserirEncomenda();
        valores[0] = encomendaV.encomendaM.getCodigoRastreio();
        valores[1] = Integer.toString(encomendaV.encomendaM.getQuantidade());
        valores[2] = Integer.toString(encomendaV.encomendaM.getTamanho());
        valores[3] = Double.toString(encomendaV.encomendaM.getValor());
        valores[4] = Double.toString(encomendaV.encomendaM.getPeso());
        valores[5] = encomendaV.encomendaM.getRemetenteCPF();
        valores[6] = encomendaV.encomendaM.getDestinatarioCPF();
        valores[7] = Integer.toString(encomendaV.encomendaM.getCodigoArmazem());
        valores[8] = Integer.toString(encomendaV.encomendaM.getUnidadePostal());
        valores[9] = Integer.toString(encomendaV.encomendaM.getNumDoCorredor());
        valores[10] = Integer.toString(encomendaV.encomendaM.getNumDaPrateleira());
        inserir("encomenda", valores, 11);
    }

    public void atualizarEncomenda(){
        encomendaV.modificarEncomenda();
        valores[0] = encomendaV.encomendaM.getCodigoRastreio();
        valores[1] = Integer.toString(encomendaV.encomendaM.getQuantidade());
        valores[2] = Integer.toString(encomendaV.encomendaM.getTamanho());
        valores[3] = Double.toString(encomendaV.encomendaM.getValor());
        valores[4] = Double.toString(encomendaV.encomendaM.getPeso());
        valores[5] = encomendaV.encomendaM.getRemetenteCPF();
        valores[6] = encomendaV.encomendaM.getDestinatarioCPF();
        valores[7] = Integer.toString(encomendaV.encomendaM.getCodigoArmazem());
        valores[8] = Integer.toString(encomendaV.encomendaM.getUnidadePostal());
        valores[9] = Integer.toString(encomendaV.encomendaM.getNumDoCorredor());
        valores[10] = Integer.toString(encomendaV.encomendaM.getNumDaPrateleira());
        update("encomenda", valores, 11);
    }
    public void visualizarEncomenda(){
        select("encomenda");
    }

}
