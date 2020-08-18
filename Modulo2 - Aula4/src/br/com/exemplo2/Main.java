package br.com.exemplo2;


public class Main {

	public static void main(String[] args) {
		
		PessoaFisica pessoa = new PessoaFisica("Mario", "rua 1", 73827823, "322323", "437843", "programador",18, 'M');
		PessoaJuridica pessoaJ = new PessoaJuridica("Mario", "rua 1", 73827823, "73827382", "437843", "programador","18", "Tipe");
		
		System.out.println(pessoa instanceof Pessoa);
		System.out.println(pessoaJ.getDocumento());

	}

}
