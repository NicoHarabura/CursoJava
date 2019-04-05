package Controle;

public class Switch {

	public static void main(String[] args) {
		String faixa = "branco";
		
		switch (faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei fazer a");
		case "marrom":
			System.out.println("Sei fazer b");
		case "amarela":
			System.out.println("Sei fazer c");
		default:
			System.out.println("sei fazer nada");
		}
	}
}
