package farmacia;

import java.util.*;

public class Farmacia {
	
	private int qtd;
	private ArrayList<Produto> estoque;
	
	
	public Farmacia(int qtd, ArrayList<Produto> estoque) {
		super();
		this.qtd = qtd;
		this.estoque = estoque;
	}
	
	public String toString() {
		return "Produto: " + estoque + ", Quantidade: " + qtd;
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
