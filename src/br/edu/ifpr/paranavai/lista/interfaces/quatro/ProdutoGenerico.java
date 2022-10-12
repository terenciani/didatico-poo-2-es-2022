package br.edu.ifpr.paranavai.lista.interfaces.quatro;

public class ProdutoGenerico implements IProduto{
	
	private String nome;
	private float custo;
	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public float getCusto() {
		return this.custo;
	}

}
