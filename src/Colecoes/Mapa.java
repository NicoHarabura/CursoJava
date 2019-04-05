package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<>();
		
		aprovados.put(1, "M");
		aprovados.put(2, "P");
		aprovados.put(3, "J");
		
		System.out.println(aprovados.get(1));
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		
		System.out.println(aprovados.entrySet());
		
		aprovados.put(3, "N");
		System.out.println(aprovados.get(3));
		
		for (Integer codigo: aprovados.keySet()){
			System.out.println(codigo);
		}
		for(String nome: aprovados.values()){
			System.out.println(nome);
		}
		
		for (Entry<Integer, String> registro: aprovados.entrySet()){
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
		
		
		
		
	}
}
