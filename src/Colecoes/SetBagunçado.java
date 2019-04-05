package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetBagunçado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("testo");
		conjunto.add(1);
		conjunto.add(1.5);
		
		System.out.println(conjunto.add(10));
		System.out.println(conjunto.add(1));
		System.out.println("Size...");
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove(1.5));
		System.out.println("remove...");
		System.out.println(conjunto.size());
		
		System.out.println("contains...");
		System.out.println(conjunto.contains(1.5));
		System.out.println(conjunto.contains('a'));
		
		Set num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		
		conjunto.retainAll(num);
		
		System.out.println(conjunto);
		System.out.println(conjunto.size());
		
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
		
		
	}
}
