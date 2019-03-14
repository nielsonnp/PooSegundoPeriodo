package br.com.ifpb.aula7;

import java.util.ArrayList;

public class Pessoa {
	
	
	String nome;
	String email;
	
	Endereco endereco;
	ArrayList<Telefone> telefones = new ArrayList<Telefone>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void addTelefone(Telefone telefone){
		telefones.add(telefone);
	}
	
	public void showTelefone(){
		for (Telefone telefone : telefones){
			System.out.println(telefone.getNumero());
		}
	}


}
