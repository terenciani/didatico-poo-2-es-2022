package br.edu.ifpr.paranavai.lista.interfaces;

public class SeguroDeVida implements Tributavel {
	public static final double TAXA = 42;
	private double premio;

	@Override
	public double calculaTributos() {
		return TAXA;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}
}
