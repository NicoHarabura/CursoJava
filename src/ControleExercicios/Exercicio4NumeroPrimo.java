package ControleExercicios;

import java.util.Scanner;

//Criar um programa que receba um numero e diga se ele e um numero primo.
public class Exercicio4NumeroPrimo {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	int num;
	System.out.println("Digite um numero:");
	num = scanner.nextInt();
		
		if (num == 1){
			System.out.println("Não é primo!");
		} else if (num == 2){
			System.out.println("É primo!");
		} else if (num == 3){
			System.out.println("É primo!");
		} else if (num % 2 == 0){
			System.out.println("Não é primo!");
		} else if (num % 3 == 0){
			System.out.println("Não é primo!");
		} else {
			System.out.println("É primo!");
		} 
	scanner.close();
	}
}
