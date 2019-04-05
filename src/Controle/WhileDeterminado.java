package Controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double somaDasNotas = 0;
		int i = 0;
		
		while (i < 3){
			System.out.println("Digite a nota:");
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			i++;
		}
		System.out.println(somaDasNotas/i);
		scanner.close();
	}
}
