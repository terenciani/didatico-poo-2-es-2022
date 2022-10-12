package br.edu.ifpr.paranavai.didatico.excecoes;

public class Calculadora {

	public static double divisao(double dividendo, double divisor) {
		if(divisor == 0) {
			throw new MinhaExcecao("Erro na divisão");
		}
		return dividendo/divisor;
	}
}
