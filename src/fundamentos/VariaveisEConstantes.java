package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raioDaCirunferencia = 4.5;
		final double PI = 3.1416;
		double area = PI * raioDaCirunferencia * raioDaCirunferencia;
		System.out.println ("O valor da area � " + area + "m�");
		System.out.printf("O valor da �rea � %f m� \n", area);
		System.out.printf("O valor da �rea � %.2f m� \n", area);
		System.out.println(area);
		
	}

}
