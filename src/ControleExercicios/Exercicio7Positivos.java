package ControleExercicios;

import java.util.Scanner;

/*Criar um programa que enquanto estiver recebendo n�meros positivos,
 * imprime no console a soma dos n�meros inseridos, caso receba um n�mero negativo, encerre o programa.
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
			System.out.println("A soma �: " + soma);
			System.out.println("Digite um novo n�mero: ");
			num = scanner.nextDouble();
		} while (num >= 0);
		
		scanner.close();
	}
}
