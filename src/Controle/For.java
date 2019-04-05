package Controle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota = 0;
		double somaDasNotas = 0;
		int i;
		
		for (i=0; i < 3; i++){
			System.out.println("Digite a nota");
			nota = scanner.nextDouble();
			somaDasNotas += nota;
		}
		scanner.close();
		System.out.println(somaDasNotas/i);
	}
}
