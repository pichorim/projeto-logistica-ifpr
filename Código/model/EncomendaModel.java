package model;

public class EncomendaModel {
    private String codigoRastreio;
    private int tamanho;
    private int quantidade;
    private double valor;
    private double peso;
    private String remetenteCPF;
    private String destinatarioCPF;
    private int unidadePostal; 
    private int codigoArmazem;
    private int numDoCorredor;
    private int numDaPrateleira;

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRemetenteCPF() {
        return remetenteCPF;
    }

    public void setRemetenteCPF(String remetenteCPF) {
        this.remetenteCPF = remetenteCPF;
    }

    public String getDestinatarioCPF() {
        return destinatarioCPF;
    }

    public void setDestinatarioCPF(String destinatarioCPF) {
        this.destinatarioCPF = destinatarioCPF;
    }

    public int getCodigoArmazem() {
        return codigoArmazem;
    }

    public void setCodigoArmazem(int codigoArmazem) {
        this.codigoArmazem = codigoArmazem;
    }

    public int getNumDoCorredor() {
        return numDoCorredor;
    }

    public void setNumDoCorredor(int numDoCorredor) {
        this.numDoCorredor = numDoCorredor;
    }

    public int getNumDaPrateleira() {
        return numDaPrateleira;
    }

    public void setNumDaPrateleira(int numDaPrateleira) {
        this.numDaPrateleira = numDaPrateleira;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getUnidadePostal() {
        return unidadePostal;
    }

    public void setUnidadePostal(int unidadePostal) {
        this.unidadePostal = unidadePostal;
    }
}
