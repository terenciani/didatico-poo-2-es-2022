package br.edu.ifpr.paranavai.lista.interfaces.quatro;

public interface IProdutoFabricado extends IProduto {
	int getNumeroIngredientes();
	IProduto getIngrediente(int numero);
}
