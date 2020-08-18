package br.com.aula2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teste = new Scanner(System.in);
		String[] nomes = new String[10];
		int[] idades = {18, 21, 5, 7, 24, 67,81};
		int numero = 20;
		
		System.out.printf("Digite um valor numerico: ");
		numero = teste.nextInt();
		/*
		for(int i = 0; i < idades.length; i++) {
			if(idades[i] >= 18) {
				System.out.println("É maior de idade");
			}else {
				System.out.println("Ainda não chegou a maioridade");
			}
		}
		
		for(int valor:idades) {
			if(valor >= 18) {
				System.out.println("É maior de idade");
			}else {
				System.out.println("Ainda não chegou a maioridade");
			}
		}
		
		nomes[0]= "Mario";
		nomes[1]= "Gustavo";
		//nomes[10] = "teste";
		
		//int math = 12/0;
		*/
	}

}
