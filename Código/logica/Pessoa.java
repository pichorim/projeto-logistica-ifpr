package logica;

public class Pessoa {
	private String CPF;
	private String primeiroNome;
	private String sobrenome;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	public Pessoa(String CPF,String primeiroNome,String sobrenome, String telefone, String email) {
		this.CPF = CPF;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = new Endereco();
	}
	
	//CPF
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	//Primeiro nome
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	//Sobrenome
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//Telefone
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Endereco
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}