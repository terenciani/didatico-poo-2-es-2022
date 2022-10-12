package br.edu.ifpr.paranavai.didatico.excecoes;

public class MinhaExcecao extends ArithmeticException{

	public MinhaExcecao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MinhaExcecao(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Mensagem Personalizada";
	}
}
