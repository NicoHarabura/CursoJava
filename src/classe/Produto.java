package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto (){
		
	}
	
	Produto ( String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	double comDesc (){
		return preco - preco*desconto;
	}

}
