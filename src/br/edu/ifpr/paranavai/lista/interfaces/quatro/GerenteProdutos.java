package br.edu.ifpr.paranavai.lista.interfaces.quatro;

public class GerenteProdutos {
	private static IProduto[] listaDeProdutos = new IProduto[100];
	
	public static String[] ingredientes(String nomeDoProduto) {
		for (int i = 0; i < listaDeProdutos.length; i++) {
			if(listaDeProdutos[i].getNome().equals(nomeDoProduto)) {
				
			}
			
		}
		return null;
	}
	public static float valorCompra(String nomeDoProduto) {
		return 0;
	}
}
