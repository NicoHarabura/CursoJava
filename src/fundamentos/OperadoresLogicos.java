package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean sorvete = trabalho1 || trabalho2;
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		
		System.out.println("Sorvete = " +sorvete);
		System.out.println("TV 50 = " +tv50);
		System.out.println("TV 32 = " +tv32);
		
		System.out.println("fome = " + !sorvete);
	}
}
