package Controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		double nota = 0;
		double somaDasNotas = 0;
		int numeroDeNotas = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a nota, ou digite uma nota negativa para sair.");
		
		while (nota >= 0){
			nota = scanner.nextDouble();
			if (nota <= 10 && nota >= 0){
				somaDasNotas += nota;
				numeroDeNotas++;
				System.out.println("Digite a próxima nota, ou digite uma nota negativa para sair.");
			}
		}
		System.out.printf("A media é: %.2f", somaDasNotas/numeroDeNotas);
		scanner.close();
	}
	
}
