package FundamentosExercicios;


import java.util.Scanner;

public class Exercicio1TemperaturaCelsius {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite a temperara em Celsius: ");
		double c = reader.nextDouble(); // Scans the next token of the input as an double.
		//once finished
		reader.close();
		System.out.println("Temperatura em Fahrenheit: " + (c *9/5)+32);		
	}
}
