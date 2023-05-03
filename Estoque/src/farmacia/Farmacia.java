package farmacia;

import java.util.*;

public class Farmacia {
	
	private int qtd;
	private ArrayList<Produto> estoque = new ArrayList<Produto>();
	
	
	public Farmacia(int qtd, ArrayList<Produto> estoque) {
		super();
		this.qtd = qtd;
		this.estoque = estoque;
	}
	
	public String toString() {
		return "Conteudo: " + estoque.get(qtd) + ", Quantidade total: " + qtd;
	}
	

	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public ArrayList<Produto> getEstoque() {
		return estoque;
	}
	public void setEstoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}
	
	
	
	

}
