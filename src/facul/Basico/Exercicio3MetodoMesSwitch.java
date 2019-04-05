package facul.Basico;

import java.util.Scanner;

public class Exercicio3MetodoMesSwitch {
	
	static void mostrarMes (int mes){
				
		switch (mes){
		case 1: System.out.println("Janeiro"); break;
		case 2: System.out.println("Fevereiro"); break;
		case 3: System.out.println("Março"); break;
		case 4: System.out.println("Abril"); break;
		case 5: System.out.println("Maio"); break;
		case 6: System.out.println("Junho"); break;
		case 7: System.out.println("Julho"); break;
		case 8: System.out.println("Agosto"); break;
		case 9: System.out.println("Setembro"); break;
		case 10: System.out.println("Outubro"); break;
		case 11: System.out.println("Novembro"); break;
		case 12: System.out.println("Dezembro"); break;
		default: System.out.println("Seu numero não faz sentido...");
		}
	}
	public static void main(String[] args) {
		System.out.println("Escreva o número correspondente ao mes: ");
		int mes = 0;
		Scanner scanner = new Scanner(System.in);
		mes = scanner.nextInt();
		mostrarMes(mes);
		scanner.close();
	}

}
