package br.com.exemplo3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Contrato contrato1 = new Contrato("Aceita esse presente", "GV", 20);
		/*
		Assinavel assinado = contrato1;
		Imprimivel impresso = contrato1;
		System.out.println(contrato1.getAssinatura());
		System.out.println(contrato1.numeroImpressao());
		contrato1.imprimir();
		*/
		
		Foto foto = new Foto();
		
		Imprimivel[] itens = {foto, contrato1};
		
		Impressora hp = new Impressora(itens);
		
		hp.imprimirTodos();
	}

}
