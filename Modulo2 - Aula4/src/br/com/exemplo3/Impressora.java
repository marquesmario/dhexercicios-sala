package br.com.exemplo3;

public class Impressora {
	
	private Imprimivel[] itens;
	
	public Impressora(Imprimivel[] itens) {
		this.itens = itens;
	}
	
	public void imprimirTodos() {
		for(int i = 0; i < this.itens.length; i++) {
			itens[i].imprimir();
		}
	}
}
