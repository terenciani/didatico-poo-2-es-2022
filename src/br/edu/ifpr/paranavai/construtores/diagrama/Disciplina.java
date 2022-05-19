package br.edu.ifpr.paranavai.construtores.diagrama;


public class Disciplina {
	//atributos
	String nome;
	int cargaHoraria;
	int ano;
	Professor professor;
	Curso curso;
	public Disciplina() {
	}
	public Disciplina(String nome, int cargaHoraria, int ano, Professor professor, Curso curso) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.ano = ano;
		this.professor = professor;
		this.curso = curso;
	}
	
	
}
