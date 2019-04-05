package FundamentosExercicios;

import java.util.Scanner;

/*
 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
 *  Use como exemplo a = 1, b = 12 e c = -13.
 *   Encontre o delta
 */
public class Exercicio6EquacaoSegundoGrau {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite os valores de a, b e c");
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		
		reader.close();
		
		double delta = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);
	}
}
