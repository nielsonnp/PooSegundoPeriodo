package br.com.ifpb.aula7;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Criando uma pessoa: ");
		
		Pessoa p = new Pessoa();
		p.setNome("Chico");
		p.setEmail("@gmail.com");
		
		System.out.println(p.getNome());
		
		System.out.println("criando os telefones: ");
		
		Telefone tel = new Telefone();
		tel.setNumero("9999999");
		
		Telefone tel2 = new Telefone();
		tel2.setNumero("3434343434");
		
		System.out.println("Adicionei os telefones das pessoa! ");
		
		p.addTelefone(tel);
		p.addTelefone(tel2);
		
		System.out.println("Apresentando os telefones: ");
		p.showTelefone();
		
				
	}

}
