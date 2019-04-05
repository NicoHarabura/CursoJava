package FundamentosExercicios;

import java.util.Scanner;

public class Exercicio3IMC {
	//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		double peso = reader.nextDouble();
		
		
		System.out.println("Digite sua altura");
		double altura  = reader.nextDouble();
		reader.close();
		
		double imc = peso/(altura*altura);
		
		System.out.printf("Seu indice de IMC é : %.2f", imc);
	}

}
