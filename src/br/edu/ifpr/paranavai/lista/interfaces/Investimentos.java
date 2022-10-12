package br.edu.ifpr.paranavai.lista.interfaces;

public class Investimentos implements Tributavel{
	private double valor;
	@Override
	public double calculaTributos() {
		return this.valor * 0.1;
	}

}
