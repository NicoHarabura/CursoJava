package ControleExercicios;

import java.util.Scanner;

//1. Criar um programa que receba um numero e verifique se ele está entre 0 e 10 e ee par;
public class Exercicio1IfPar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		System.out.println("Digite um numero:");
		num = scanner.nextInt();
		if (num >= 0 && num <=10 && num % 2 == 0 ){
			System.out.println("Esse numero esta entre 0 e 10, e é par!");
		} else {
		System.out.println("Esse numero é inválido");
		}
		scanner.close();
		
		
	}
}
