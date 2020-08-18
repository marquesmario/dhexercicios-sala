package br.com.exemplo2;

public class PessoaFisica extends Pessoa{

	private String cpf;
	private String rg;
	private String profissao;
	private int idade;
	private char sexo;
	
	
	public PessoaFisica(String nome, String endereco, int telefone, String cpf, String rg, String profissao, int idade,
			char sexo) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
		this.idade = idade;
		this.sexo = sexo;
	}


	@Override
	public String getDocumento() {
		return this.cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
