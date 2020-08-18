package br.com.exemplo2;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private String razaoSocial;
	private String porte;
	private String socio;
	private String segmento;
	
	public PessoaJuridica(String nome, String endereco, int telefone, String cnpj, String razaoSocial, String porte,
			String socio, String segmento) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.porte = porte;
		this.socio = socio;
		this.segmento = segmento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getSocio() {
		return socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	@Override
	public String getDocumento() {
		return this.cnpj;
	}
	
	
}
