package logica;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnidadePostal {
	private int codigo;
	private Date dataPostagem;
	private Date dataPrevisao;
	
	//codigo
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//data postagem
	public Date getDataPostagem() {
		return dataPostagem;
	}
	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
	
	//previsão de entrega
	public Date getDataPrevisao() {
		return dataPrevisao;
	}
	public void setDataPrevisao(Date dataPrevisao) {
		this.dataPrevisao = dataPrevisao;
	}
}
