package br.com.exemplo1;

public class Veiculo {
	
	private String marca;
	private String placa;
	private String cor;
	private String modelo;
	private int ano;
	private String combustivel;
	private Carro carro;
	
	public Veiculo(String marca, String placa, String cor, String modelo, int ano, String combustivel) {
		this.marca = marca;
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.combustivel = combustivel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public boolean isFlex() {
			System.out.println("Metodo 1");
			return this.combustivel.equals("Flex");
	}
	
	public boolean isFlex(String combustivel) {
		System.out.println("Metodo 2");
		if(this.combustivel.equals("Flex") && combustivel.equals("Gasolina")) {
			return true;
		}else {
			return false;
		}
}
	
}
