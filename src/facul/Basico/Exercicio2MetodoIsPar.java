package facul.Basico;

public class Exercicio2MetodoIsPar {
	static boolean isPar(int n1){
		if (n1 % 2 == 0){
			return true;
		} 
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPar(3));
	}

}
