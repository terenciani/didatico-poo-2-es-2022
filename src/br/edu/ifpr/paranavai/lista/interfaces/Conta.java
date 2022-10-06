package br.edu.ifpr.paranavai.lista.interfaces;

public abstract class Conta {
	private double saldo;

	public double obterSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if((this.saldo - valor) >= 0 )
			this.saldo = this.saldo - valor;
		else
			System.out.println("Saldo Insuficiente");
	}
	
}
