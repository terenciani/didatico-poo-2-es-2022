package br.edu.ifpr.paranavai.didatico.construtores.principal;

import br.edu.ifpr.paranavai.didatico.construtores.diagrama.Curso;
import br.edu.ifpr.paranavai.didatico.construtores.diagrama.Estudante;

public class Inicio {

	public static void main(String[] args) {		
		//instancia��o
		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante("Jo�o");
		System.out.println("Voc� digitou: " + estudante.getNomeCompleto());
		System.out.println("Voc� digitou: " + estudante2.getNomeCompleto());
		Curso curso = new Curso();
		
	}

}
