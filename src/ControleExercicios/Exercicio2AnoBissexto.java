package ControleExercicios;

import java.util.Scanner;

//2. Criar um programa informa se o ano atual e um ano bissexto;
/* Se ano dividido por 4 e não dividido por 100, entao bissexto
 * se ano nao dividido por 4 e nao for por 400, entao nao bissexto
 * se ano nao dividido por 4 e for por 400, entao bissexto
 */


public class Exercicio2AnoBissexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ano;
		System.out.println("Digite o ano desejado");
		ano = scanner.nextInt();
		
		if (ano % 4 == 0){
			if (ano % 100 != 0 ){
				System.out.println("O ano digitado é bissexto!");
		}			
		} else if (ano % 400 == 0 ){
			System.out.println("O ano digitado é bissexto!");
		} else {
			System.out.println("O ano digitado não é bissexto");
		}
		scanner.close();
		
	}
}
