package com.ifpb.projeto8;

import java.util.ArrayList;

public class Empresa {

	int id;
	String nome;
	float tamanho;
	
	ArrayList<Empregado> empregados = new ArrayList<Empregado>();
	
	public Empresa(int id, String nome){
		this.id = id;
		this.nome = nome;
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

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public ArrayList<Empregado> getEmpregados(){
		return empregados;
	}
	
	public void setEmpregados(ArrayList<Empregado> empregados){
		this.empregados = empregados;
	}
 
	public void addEmpregado(Empregado empregado){
		empregados.add(empregado);
	}
}
