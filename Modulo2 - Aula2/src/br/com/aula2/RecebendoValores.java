package br.com.aula2;

import java.util.Scanner;

public class RecebendoValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner recebeValor = new Scanner(System.in);
		int valor;
		String valorString;
		
		System.out.println("Digite um numero: ");
		valor = recebeValor.nextInt();
		System.out.println("O numero foi " + valor);
		
		System.out.println("Digite um nome: ");
		valorString = recebeValor.next();
		System.out.println("O nome foi " + valorString);
	}

}
