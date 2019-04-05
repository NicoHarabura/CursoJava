package FundamentosExercicios;

import java.util.Scanner;

public class Exercicio4QuadradoECubo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite o número: ");
		double num1 = reader.nextDouble();
		reader.close();
		
		System.out.printf("O quadrado do numero é %.2f e o cubo %.2f", num1*num1, num1*num1*num1);
		
	}
}
