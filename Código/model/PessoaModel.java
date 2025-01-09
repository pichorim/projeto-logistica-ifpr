package model;

public class PessoaModel {
    private String CEP;
    private String valoresEndereco[] = new String[6];
    private String CPF;
    private String nome;
    private String sobrenome;
    private Endereco endereco = new Endereco();
    private String email;
    private String telefone;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
