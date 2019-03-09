package com.ranyelson.agenda;

public class Principal {

	public static void main(String[] args) {

		Pessoas p1 = new Pessoas();
		p1.setId(1);
		p1.setNome("Ranyelson");
		
		Endereco endA = new Endereco();
		endA.setRua("Rua: Maria");
		endA.setNumero("29");
		endA.setBairro("Prata");
		endA.setCidade("Campina");
		
		p1.setEndereco(endA);
		
		System.out.println(p1.id);
		System.out.println(p1.nome);
		System.out.println(endA.rua);
		System.out.println(endA.numero);
		System.out.println(endA.bairro);
		System.out.println(endA.cidade);
		
		
	}

}
