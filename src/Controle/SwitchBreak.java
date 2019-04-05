package Controle;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nota = 0;
		String conceito = "";
		
		System.out.println("Qual a nota do aluno?");
		nota = scanner.nextInt();
		
		
		switch (nota){
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = "Nota inválida";
			break;
		}
		System.out.println("Seu conceito é: " + conceito);
		scanner.close();
	}
}
