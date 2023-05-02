package farmacia;

import java.util.*;
import java.util.ArrayList;


public class Principal {
	
	static Estetica b;
	static Saude s;
	static Farmacia f;



	public static void main(String[] args) {
		
		
		
	
		b = new Estetica("Shampoo",5, "Estetica", 20.0, "Higiene", "Cabeca");
		s = new Saude("Dipirona",7, "Saude", 10.0, "Febre", "Sem Traja");
		f.getEstoque().add(b);
		f = new Farmacia(0,ArrayList<Produto>());
		

		System.out.println(b.getNome().toString());
		b.setNome("Bolacha");
		System.out.println(b.getNome().toString());


		
		
		System.out.println(b.toString());
		System.out.println(s.toString());
		System.out.println(f.toString());
		

	}

}
