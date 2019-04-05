package facul.Basico;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6LerVetor {
	
	 

	static void lerVetor (String []vetor){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++){
			vetor[i]=scanner.nextLine();
		}
		scanner.close();
	}
	
	static String[] ordenarCrescente (String []vetor){
		Arrays.sort(vetor);
		return vetor;
	}
	
	static void imprimirVetor (String []vetor){
		System.out.println(Arrays.toString(vetor));
	}
	
public static void main(String[] args) {
		String []nomes = {"","",""};
		lerVetor(nomes);
		imprimirVetor(nomes);
		ordenarCrescente(nomes);
		imprimirVetor(nomes);
	}
	
}
