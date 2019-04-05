package facul.Basico;

public class Exemplo6ModificadorVetor {
	
	static void modificar (int []vetor){
		for (int i = 0; i < vetor.length; i++){
			vetor[i] = vetor[i]/2;
		}
	}
	public static void main(String[] args) {
		int []vetorPrincipal = {20, 40, 50, 200};
		
		for (int i = 0; i < vetorPrincipal.length; i++){
			System.out.printf(vetorPrincipal[i] + " ");
		}
		modificar(vetorPrincipal);
		for (int i = 0; i < vetorPrincipal.length; i++){
			System.out.printf(vetorPrincipal[i] + " ");
		}
	}

}
