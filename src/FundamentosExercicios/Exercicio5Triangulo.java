package FundamentosExercicios;

import java.util.Scanner;

public class Exercicio5Triangulo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite a altura de triangulo: ");
		double altura = reader.nextDouble();
		
		System.out.println("Digite a base: ");
		double base = reader.nextDouble();
		
		reader.close();
		
		double area = base*altura/2;
		System.out.printf("A area do triangulo é: %.2f", area );
	}
}
