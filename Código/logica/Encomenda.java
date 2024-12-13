package logica;

public class Encomenda {
	private String codigoRastreio;
	private int quantidade;
	private int tamanho;
	private float valorUnitario;
	private float peso;
	private UnidadePostal UP;
	private Armazem armazem;
	
	public Encomenda(String codigoRastreio,int quantidade,int tamanho,float valorUnitario,float peso,UnidadePostal UP,Armazem armazem) {
		this.codigoRastreio = codigoRastreio;
		this.quantidade = quantidade;
		this.tamanho = tamanho;
		this.valorUnitario = valorUnitario;
		this.peso = peso;
		this.UP = new UnidadePostal();
		this.armazem = new Armazem();
	}
	
	//Código de rastreio
	public String getCodigoRastreio() {
		return codigoRastreio;
	}
	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	
	//Quantidade
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Tamanho, definir unidade de medida
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	//Valor unitário
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	//Peso
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//Unidade Postal
	public UnidadePostal getUP() {
		return UP;
	}
	public void setUP(UnidadePostal uP) {
		UP = uP;
	}
	
	//Armazem
	public Armazem getArmazem() {
		return armazem;
	}
	public void setArmazem(Armazem armazem) {
		this.armazem = armazem;
	}
}