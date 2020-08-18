package br.com.escolhaAlunos;

public class Gato {
	
	private String nome;
	private String raca;
	private double tamanho;
	private double peso;
	private String cor;
	private boolean chato;
	private char sexo;
	private int idade;
	
	public Gato() {
		
	};
	
	public Gato(String nome, String raca, double tamanho, double peso) {
		this.nome = nome;
		this.raca = raca;
		this.tamanho = tamanho;
		this.peso = peso;
	}
	
	
	public void miar() {
		System.out.println("Miauuuu");
	}
	
	public boolean isChato() {
		boolean chato;
		if(this.chato) {
			System.out.println("Ele é chato");
			chato = true;
		}else {
			System.out.println("Ele é manso");
			chato = false;
		}
		
		return chato;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public void setChato(boolean chato) {
		this.chato = chato;
	}


	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", raca=" + raca + ", tamanho=" + tamanho + ", peso=" + peso + ", cor=" + cor
				+ ", chato=" + chato + ", sexo=" + sexo + ", idade=" + idade + "]";
	}
	
}
