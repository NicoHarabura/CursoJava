package Colecoes;

import java.util.Set;
import java.util.TreeSet;

public class SetComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<String>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for (String nome: aprovados){
			System.out.println(nome);
		}
		
	}
}
