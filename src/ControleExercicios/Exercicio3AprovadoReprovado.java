package ControleExercicios;

import java.util.Scanner;

/*Criar um programa que receba duas notas parciais, calcular a media final. 
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
 *  se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperacao",
 *  caso contraario imprime no console "Reprovado".
 */

public class Exercicio3AprovadoReprovado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, mediaFinal;
				
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextDouble();
		mediaFinal = (nota1+nota2)/2;
		
		if (mediaFinal >= 7){
			System.out.println("Aprovado");
		} else if (mediaFinal < 7 && mediaFinal > 4 ){
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		scanner.close();
		
	}

}
