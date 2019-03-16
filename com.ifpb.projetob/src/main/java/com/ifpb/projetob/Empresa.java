
package com.ifpb.projetob;

import java.util.ArrayList;

public class Empresa {

	int id;
	String nome;
	float tamanho;

	ArrayList<Empregado> listaDeEmpregados = new ArrayList<Empregado>();

	
	public Empresa(String nome, int id, float tamanho){
	      this.nome = nome; 
	      this.id = id;
	      this.tamanho = tamanho;
	                             
	 }

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getTamanho() {
		return tamanho;
	}

	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}

}
