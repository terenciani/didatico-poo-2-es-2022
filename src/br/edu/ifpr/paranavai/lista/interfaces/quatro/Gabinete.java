package br.edu.ifpr.paranavai.lista.interfaces.quatro;

public class Gabinete extends ProdutoGenerico implements IProdutoFabricado {
	
	private int numeroDeIngredientes;
	private Componente[] componentes = new Componente[20];
	
	@Override
	public int getNumeroIngredientes() {
		return this.numeroDeIngredientes;
	}

	@Override
	public IProduto getIngrediente(int numero) {
		return this.componentes[numero];
	}

}
