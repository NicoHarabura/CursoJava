package OO.Polimorfismo;

public class Jantar2 {
	public static void main(String[] args) {
		
		Pessoa2 pessoa = new Pessoa2(90);
		
		Bebida coca = new Coca();
		Bebida suco = new Suco();
		
		coca.setPeso(.5);
		suco.setPeso(.02);
		
		pessoa.beber(coca);
		pessoa.beber(suco);
		
		System.out.println(pessoa.getPeso());
		
	}

}
