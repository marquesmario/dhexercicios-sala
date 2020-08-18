
public class loop{
	public static void main(String[] args) {
		
		
		byte miniContador = (byte) 126;
		short miniContador2 = (short) 38444;
		int contador = 1829318;
		String pais = "Mexico";
		
		float valorReal = 39.4f;
		double valorReal2 = 39.4;
		boolean verdadeiro = true;
		boolean falso = false;
		
		/*
		if(verdadeiro) {
			System.out.println(miniContador);
		}
		
		if(!((falso && true) || (false || true))) {
			System.out.println("Entrou aqui");
		}else if(!falso) {
			System.out.println("Entrou no segundo");
		}else {
			System.out.println("Não entrou no if");
		}
		
		switch(pais){
			case "Brasil":
				System.out.println("Brasileiro aqui");
				break;
			case "USA":
				System.out.println("Americano");
				break;
			default:
				System.out.println("Não indentifiquei a nacionalidade");
				break;
		}
		
		
		
		for(int contadora = 0; contadora < miniContador ; contadora++){
			System.out.println("Valor atual " + contadora);
		}
		*/
		int contadora = 0;
		
		//while() {
		//			contadora++;
		//}
		
		//do {
		//	System.out.println( contadora + " papapa");
		//	contadora++;
		//}while(contadora <= 0);
		
		int numerosNovos[] = new int[4];
		int numeros[] = {1,3,4,5,6,7};
		
		int teste = 5/0;
		System.out.println(numerosNovos.length);
		System.out.println(numeros[4]);
		
		
	}
}
