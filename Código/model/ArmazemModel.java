package model;

public class ArmazemModel {
    private int codigoArmazem;
    private String CEP, valoresEndereco[] = new String[6];
    private Endereco endereco = new Endereco();

    public int getCodigoArmazem(){
        return codigoArmazem;
    }
    public void setCodigoArmazem(int cod){
        this.codigoArmazem = cod;
    }
    public String getCEP(){
        return CEP;
    }
    public void setCEP(String CEP){
        this.CEP = CEP;
    }
    public String[] getEndereco(){
        valoresEndereco[0] = endereco.getPais();
        valoresEndereco[1] = endereco.getEstado();
        valoresEndereco[2] = endereco.getCidade();
        valoresEndereco[3] = endereco.getBairro();
        valoresEndereco[4] = endereco.getRua();
        valoresEndereco[5] = Integer.toString(endereco.getNumero());
        return valoresEndereco;
    }
    public void setEndereco(String pais, String estado, String cidade, String bairro, String rua, int numero){
        endereco.setPais(pais);
        endereco.setEstado(estado);
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setNumero(numero);
    }
}
