package br.edu.ifpr.paranavai.didatico.excecoes;

public class TestaExcecao {

	public static void main(String[] args) {
//		try {
		

//		}catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Não é divisível por zero!");
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("Bora Billl");
//		}
		double x = Calculadora.divisao(12, 0);		
		System.out.println("passou aqui");

	}

}
