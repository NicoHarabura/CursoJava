package Colecoes;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.push("Pequeno Príncipe");
		pilha.push("Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
	}
}
