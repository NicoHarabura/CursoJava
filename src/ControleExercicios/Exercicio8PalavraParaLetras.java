package ControleExercicios;

import java.util.Scanner;

/*Criar um programa que receba uma palavra e imprime no console letra por letra.
*/
public class Exercicio8PalavraParaLetras {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String palavra = null;
	int i = 0;
	int num = 0;
	
	System.out.println("Digite uma palavra: ");
	palavra = scanner.nextLine();
	num = palavra.length();
		while (i < num){
			System.out.println(palavra.charAt(i));
			i++;
		}
		scanner.close();
}
}
