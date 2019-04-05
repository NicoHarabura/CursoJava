package FundamentosExercicios;

import java.util.Scanner;

public class Exercicio2TemperaturaFahrenheit {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite a temoeratura em Fahrenheit: ");
		double f = reader.nextDouble();
		System.out.println("A temperatura em Celsius é: " + (f - 32)*5/9);
		reader.close();
	}
}
