package Colecoes;

public class EnderešoTeste {

	public static void main(String[] args) {
		Enderešo endereco1 = new Enderešo("Rua 2", 126, "Casa");
		Enderešo endereco2 = new Enderešo("Rua 2", 126, "Casa");
		
		System.out.println(endereco1 == endereco2);
		System.out.println(endereco1.equals(endereco2));
		
	}
}
