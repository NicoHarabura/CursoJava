package ControleExercicios;

import java.util.Random;
import java.util.Scanner;

/*Jogo da adivinhacao: Tentar adivinhar um numero entre 0 - 100.
 *  Armazene um numero aleatorio em uma variavel. O Jogador tem 10 tentativas para adivinhar o numero gerado.
 *   Ao final de cada tentativa, imprima a quantidade de tentativas restantes
 *, e imprima se o numero inserido ee maior ou menor do que o numero armazenado.
 */
public class Exercicio6JogoAdivinhar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int num, numj, i;
		num = random.nextInt(101);
		
		System.out.println("Tente adivinhar o numero de 0 a 100:");
		
		for (i = 9; i >= 0; i--){
			numj = scanner.nextInt();
			System.out.println("Você tem " + i + " tentativas!");
			if (numj == num){
				System.out.println("Você acertou!");
				break;
			} else if ( numj > num){
				System.out.println("Menos...");
			} else {
				System.out.println("Mais...");
			}
			
			
		}
		if (i <  0){
			System.out.println("Acabaram suas tentativas!");
		}
		System.out.println("Fim de jogo!");
		
		scanner.close();		
	}
}
