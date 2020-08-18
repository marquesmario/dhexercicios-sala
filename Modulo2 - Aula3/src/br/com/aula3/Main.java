package br.com.aula3;

public class Main {
	
	
	public static void main(String[] args) {
		
		int numero1 = 20;
		int[] numero2 = new int[1];
		numero2[0] = 4;
	
		System.out.println(dobro(numero1));
		System.out.println(numero1);
		
		System.out.println(dobro(numero2[0]));
		System.out.println(numero2[0]);
		
		dobro2(numero2);
		System.out.println(numero2[0]);
	
		
	}

	static int dobro(int n1){
		n1 = n1 * 2;
		return n1;
	};
	
	
	static void dobro2(int n1[]){
		n1[0] = n1[0] * 2;
		System.out.println(n1[0]);
	};
	

};

