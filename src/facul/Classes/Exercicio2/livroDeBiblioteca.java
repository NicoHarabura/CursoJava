package facul.Classes.Exercicio2;

import java.util.Scanner;

public class livroDeBiblioteca extends livro{

	int quantidade;
	int tempoAluguel;
	boolean estoque;
	boolean atrasado;
	
	static void cadastrarLivro (livroDeBiblioteca book){
		
		book.atrasado = false;
		book.tempoAluguel = 0;
		book.estoque = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome: ");
		book.nome=scanner.nextLine();
		System.out.println("Autor: ");
		book.autor=scanner.nextLine();
		System.out.println("Preço: ");
		book.preco=scanner.nextDouble();
		System.out.println("Quantidade: ");
		book.quantidade=scanner.nextInt();
				
		scanner.close();
	}
	
	static void alugadoPorLeitor (livroDeBiblioteca book){
		if (book.estoque == true){
		book.tempoAluguel = 10;
		book.quantidade -= 1;
		} else {
			System.out.println("Livro não está disponivel ainda.");
		}
	}
	
	static void passarDias (livroDeBiblioteca book, int dia){
		
		book.tempoAluguel -= dia;
	}
	
	static void checarAtraso (livroDeBiblioteca book){
		
		if (book.tempoAluguel < 0){
			book.atrasado = true;
			System.out.println("ATRASADO!!!");
		} else {
			System.out.println("Livro em dia! Faltam " + book.tempoAluguel + " dias.");
		}
	}
	
	static void checarEstoque (livroDeBiblioteca book){
		
		if (book.quantidade <= 0){
			book.estoque = false;
			System.out.println("Livro fora de estoque!");
		} else {
			System.out.println("Ainda temos " + book.quantidade+ " Livro(s).");
		}
	}
	
	static void receberLivro (livroDeBiblioteca book){
		
		book.tempoAluguel = 0;
		book.quantidade += 1;
		book.atrasado = false;
		book.estoque = true;
		System.out.println("Obrigado!");
	}
	
}
