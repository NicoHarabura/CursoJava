package ControleExercicios;
/*Crie um programa que recebe 10 valores e ao final imprima o maior numero.
 * 
 */

import java.util.Scanner;

public class Exercicio9Maior {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0, numAtual = 0;
		System.out.println("Digite um numero: ");
		num = scanner.nextInt();
		
		for (int i = 0; i < 10; i++ ){
			if (num > numAtual){
				numAtual = num;
			}
		System.out.println("Digite um novo numero: ");
		num = scanner.nextInt();
		}
	System.out.println("O maior numero é: " + numAtual);
	scanner.close();
		
	}
}
