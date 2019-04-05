package facul.Basico;

import java.util.Scanner;

public class Exercicio4MetodosVetor {
	
	static void lerVetor (double []vetor){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++){
			System.out.println("Digite o número: ");
			vetor[i] = scanner.nextDouble(); 
		}
		scanner.close();
	}
	static double somarNumeros (double []vetor){
		double soma = 0;
		for (int i = 0; i < vetor.length; i++){
		soma += vetor[i];
		}
		return soma;
	}
	static double calularMedia (double []vetor){
		double soma = 0, media;
		int j = 0;
		for (int i = 0; i < vetor.length; i++){
		soma =+ vetor[i];
		j = i;
		}
		return media = soma/j;
	}
	public static void main(String[] args) {
		double []vetorPrincipal = {0,0,0};
		lerVetor(vetorPrincipal);
		System.out.println(somarNumeros(vetorPrincipal));
		System.out.println(calularMedia(vetorPrincipal));
	}

}
