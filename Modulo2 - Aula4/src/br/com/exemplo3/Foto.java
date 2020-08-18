package br.com.exemplo3;

public class Foto implements Imprimivel {

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Sou uma foto");
	}

	@Override
	public int numeroImpressao() {
		// TODO Auto-generated method stub
		return 15;
	}

}
