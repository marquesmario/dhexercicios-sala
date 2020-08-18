package br.com.escolhaAlunos;

public class Main {
	
	public static void main(String[] args) {
		
		String nome = "docinho";
		boolean chato = true;
		Gato gato1 = new Gato("docinho", "persa", 0.4, 13);
		Gato gato2 = new Gato("docinho", "persa", 0.4, 13);
		Gato gato3 = gato1;
		//System.out.println(gato1.toString());
		
		
		//System.out.println(gato1.isChato());
		
		//gato1.setChato(chato);
		
		//System.out.println(gato1.isChato());
		
		System.out.println(gato1.toString());
		//System.out.println(gato1.isChato());
		//gato1.miar();
	}
}
