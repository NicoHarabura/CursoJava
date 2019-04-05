package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("João");
		fila.offer("Maria");
		fila.offer("Rafael");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		
		fila.add("João");
		fila.offer("Maria");
		fila.offer("Rafael");
		
		for (String nome: fila){
			System.out.println(nome);
		}
	}
}
