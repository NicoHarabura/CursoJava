package OO.Polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida arroz = new Arroz();
		arroz.setPeso(0.02);
		Comida feijao = new Feijao();
		feijao.setPeso(0.03);
		
		Pessoa pessoa = new Pessoa(80.5);
		
		pessoa.Comer(feijao, arroz);
		
		
		Bebida coca = new Coca();
		Bebida suco = new Suco();
		
		coca.setPeso(0.5);
		suco.setPeso(0.05);
		
		pessoa.Beber(suco, coca);
		
		
		System.out.println(pessoa.getPeso());
	}

}
