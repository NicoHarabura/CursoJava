package Colecoes;

public class EndereçoTeste {

	public static void main(String[] args) {
		Endereço endereco1 = new Endereço("Rua 2", 126, "Casa");
		Endereço endereco2 = new Endereço("Rua 2", 126, "Casa");
		
		System.out.println(endereco1 == endereco2);
		System.out.println(endereco1.equals(endereco2));
		
	}
}
