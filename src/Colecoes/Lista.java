package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("a");
		aprovados.add("c");
		aprovados.add("b");
		
		System.out.println(aprovados.get(0));
		
		aprovados.add("a");
		System.out.println(aprovados.remove("A"));
		System.out.println("Size..." + aprovados.size());
		aprovados.remove("a");
		
	}
}
