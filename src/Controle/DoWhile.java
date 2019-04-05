package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota = 0;
		double somaNotas = 0;
		int i = 0;
		
		do{
			
			nota = scanner.nextDouble();
			if (nota <= 10 && nota >=0){
				somaNotas += nota;
				i++;
			}
			
		} while (nota != -1);
		scanner.close();
		System.out.println(somaNotas/i);
	}
}
