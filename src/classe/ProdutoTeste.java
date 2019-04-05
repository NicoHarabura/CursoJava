package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "livro";
		produto1.preco = 50.0;
		
		Produto produto2 = new Produto ("Pipa", 20.0);
		
		Produto.desconto = 0.25;
		
		System.out.println(produto1.comDesc());
		System.out.println(produto2.comDesc());
	}

}
