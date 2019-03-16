package com.ifpb.projetob;

public class Programa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("Jennifer", 1, 3.5f);

		System.out.println(empresa.getNome() + " " + empresa.getId() + " " + empresa.getTamanho());

	}

}