package Colecoes;

public class Endere�oTeste {

	public static void main(String[] args) {
		Endere�o endereco1 = new Endere�o("Rua 2", 126, "Casa");
		Endere�o endereco2 = new Endere�o("Rua 2", 126, "Casa");
		
		System.out.println(endereco1 == endereco2);
		System.out.println(endereco1.equals(endereco2));
		
	}
}
