package facul.Basico;

public class Exercicio1MetodoMaior {
	
	static void determinarMaior (int n1, int n2){
		if (n1 > n2){
			System.out.println("O maior é o "+n1);
		} else {
			System.out.println("O maior é o "+n2);
		}
	}
	
	public static void main(String[] args) {
		determinarMaior(14, 20);
	}

}
