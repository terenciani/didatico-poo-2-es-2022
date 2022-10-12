package br.edu.ifpr.paranavai.lista.interfaces;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		SeguroDeVida seguroDeVida2 = new SeguroDeVida();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaCorrente.depositar(10000);
		contaCorrente.sacar(500);
		System.out.println(contaCorrente.obterSaldo());
		
		System.out.println(contaCorrente.calculaTributos());
		
		Tributavel[] listaDeTributaveis = new Tributavel[5];
		
		listaDeTributaveis[0] = contaCorrente;
		listaDeTributaveis[1] = seguroDeVida;
		listaDeTributaveis[2] = contaCorrente;
		listaDeTributaveis[3] = contaCorrente;
		listaDeTributaveis[4] = contaCorrente;
		
		GerenciadorDeImpostoDeRenda gdr = new GerenciadorDeImpostoDeRenda();
		
		double soma = gdr.somarValores(listaDeTributaveis);
		
		gdr.adicionar(seguroDeVida2);
		
		System.out.println(gdr.getSoma());
		
	}
}
