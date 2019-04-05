package ControleExercicios;

import java.util.Scanner;

/*Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa.
 *  Tente utilizar a estrutura do while.
 */

public class Exercicio7Positivos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num = 0;
		double soma = 0;
		num = scanner.nextDouble();
		
		do {
			soma += num; 
			System.out.println("A soma é: " + soma);
			System.out.println("Digite um novo número: ");
			num = scanner.nextDouble();
		} while (num >= 0);
		
		scanner.close();
	}
}
