package br.edu.ifpr.paranavai.lista.interfaces;

public class GerenciadorDeImpostoDeRenda {
	private double soma;
	
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public double somarValores(Tributavel[] listaDeTributaveis) {
		this.soma = 0;	
		for (int i = 0; i < listaDeTributaveis.length; i++) {
			this.soma = this.soma + listaDeTributaveis[i].calculaTributos();
		}
		return this.soma;
	}
	
	public void adicionar(Tributavel tributavel) {
		this.soma = this.soma + tributavel.calculaTributos();		
	}
}
