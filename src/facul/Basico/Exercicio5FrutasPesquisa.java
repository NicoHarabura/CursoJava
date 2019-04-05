package facul.Basico;

public class Exercicio5FrutasPesquisa {
	
	static boolean pesquisar (String []vetor, String fruta){
		boolean resultado = false;
		for (int i = 0; i < vetor.length; i++){
			if (vetor[i].equals(fruta)){
				resultado =  true;
				break;
			} else {
				resultado = false;
			}
		}
		return resultado;
	}
	
	static String pesquisar (String []vetor, int indice){
		String fruta = null;
		for (int i = 0; i < vetor.length; i++){
			if (i == indice){
				fruta = vetor[i];
			}
		}
		return fruta;
		
	}
	
	static String[] pesquisar (String []vetor, char ini){
		char[] vetorChar;
		String []vetornovo = {"", "", "", "", "","", "", "", "","", "", "", "","", ""};
		for (int i = 0; i < vetor.length; i++){
			vetorChar = vetor[i].toCharArray();
			if (vetorChar[0]==ini){
				vetornovo[i] = vetor[i];
				System.out.println(vetornovo[i]);
			}
		}
		
		return vetornovo;
		
	}
	
	public static void main(String[] args) {
		String []vetorFrutas = {"carambola", "maçã", "pera", "uva", "laranja",
				"goiaba", "ameixa", "mamão", "melancia",
				"framboesa", "pitanga", "açaí", "graviola",
				"banana", "maracujá"};
		System.out.println(pesquisar(vetorFrutas, "graviola"));
		System.out.println(pesquisar(vetorFrutas, 0));
		pesquisar(vetorFrutas, 'a');
	}

}
