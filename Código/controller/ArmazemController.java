package controller;

import conexao.CRUD;
import view.ArmazemView;

public class ArmazemController extends CRUD{

    public ArmazemView armazemV = new ArmazemView();
    private String PK;
    private String[] valores = new String[8];
    private String[] aux = new String[6];

    public void removerArmazem(){
        armazemV.deletarArmazem();
        PK = Integer.toString(armazemV.armazemM.getCodigoArmazem());
        delete("armazem",PK);
    }

    public void adicionarArmazem(){
        armazemV.inserirArmazem();
        valores[0] = Integer.toString(armazemV.armazemM.getCodigoArmazem());
        valores[1] = armazemV.armazemM.getCEP();
        aux = armazemV.armazemM.getEndereco();
        for(int i = 2; i<8;i++){
            valores[i] = aux[i-2];
        }
        inserir("armazem", valores, 8);
    }

    public void atualizarArmazem(){
        armazemV.modificarArmazem();
        valores[0] = Integer.toString(armazemV.armazemM.getCodigoArmazem());
        valores[1] = armazemV.armazemM.getCEP();
        aux = armazemV.armazemM.getEndereco();
        for(int i = 2; i<8;i++){
            valores[i] = aux[i-2];
        }
        update("armazem", valores, 8);
        
    }
    public void visualizarArmazem(){
        select("armazem");
    }
}
