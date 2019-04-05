package facul.Classes.Exercicio2;

public class biblioteca {
	
public static void main(String[] args) {
		
		livroDeBiblioteca livro1 = new livroDeBiblioteca();
		
		livroDeBiblioteca.cadastrarLivro(livro1);
		livroDeBiblioteca.checarEstoque(livro1);
		livroDeBiblioteca.checarEstoque(livro1);
		livroDeBiblioteca.alugadoPorLeitor(livro1);
		livroDeBiblioteca.checarAtraso(livro1);
		livroDeBiblioteca.checarEstoque(livro1);
		livroDeBiblioteca.passarDias(livro1, 11);
		livroDeBiblioteca.alugadoPorLeitor(livro1);
		livroDeBiblioteca.checarAtraso(livro1);
		livroDeBiblioteca.receberLivro(livro1); 
		livroDeBiblioteca.checarAtraso(livro1);
		livroDeBiblioteca.checarEstoque(livro1);
		
		
	}
	
	
	
	
	
	

}
