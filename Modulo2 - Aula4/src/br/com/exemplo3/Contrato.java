package br.com.exemplo3;

public class Contrato implements Assinavel, Imprimivel {

	private int numeroDePaginas;
	private String assinatura;
	private String contrato;
	
	public Contrato(String contrato, String assinatura, int numeroDePaginas) {
		this.assinatura = assinatura;
		this.contrato = contrato;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Contrato " + this.contrato + " Assinatura " + this.assinatura);
		// TODO Auto-generated method stub	
	}


	public int numeroImpressao() {
		// TODO Auto-generated method stub
		return this.numeroDePaginas;
	}

	@Override
	public String getAssinatura() {
		// TODO Auto-generated method stub
		return this.assinatura;
	}

}
