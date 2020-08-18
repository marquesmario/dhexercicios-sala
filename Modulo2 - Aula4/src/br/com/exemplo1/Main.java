package br.com.exemplo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carro relampagoMarquinhos = new Carro("fon", true, "ferrari", "XXX1234", "Vermelho", "ferrari", 2020, "Flex");
		Veiculo veiculo1 = new Veiculo("ferrari", "XXX1234", "Vermelho", "ferrari", 2020, "Flex");
		Veiculo veiculo2 = new Carro("fon", true, "ferrari", "XXX1234", "Vermelho", "ferrari", 2020, "Flex");
		
		Veiculo[] veiculos = new Veiculo[10];
		veiculos[0] = relampagoMarquinhos;
		veiculos[1] = veiculo1;
		veiculos[2] = veiculo2;
		
		
		
		System.out.println();
		System.out.println();
		
	}

}