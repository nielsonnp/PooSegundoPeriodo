package com.ifpb.projeto8;

public class Programa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa(1, "Tim");	
		System.out.println("ID: " + empresa.getId() + " - " + 
							"Nome da Empresa:" + " " + empresa.getNome());
		
		Empregado empregado1 = new Empregado("João", 100);
		Empregado empregado2 = new Empregado("Maria", 200);
		Empregado empregado3 = new Empregado("Chico", 300);
				
		empresa.addEmpregado(empregado1);
		empresa.addEmpregado(empregado2);
		empresa.addEmpregado(empregado3);
		
		for (Empregado emp: empresa.getEmpregados()){
			System.out.println("Nome do empregado: " + emp.getNome() + " - " + 
								"Salário: " + emp.getSalario());	
		}
	}
}
