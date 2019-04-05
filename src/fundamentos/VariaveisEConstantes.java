package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raioDaCirunferencia = 4.5;
		final double PI = 3.1416;
		double area = PI * raioDaCirunferencia * raioDaCirunferencia;
		System.out.println ("O valor da area é " + area + "m²");
		System.out.printf("O valor da área é %f m² \n", area);
		System.out.printf("O valor da área é %.2f m² \n", area);
		System.out.println(area);
		
	}

}
