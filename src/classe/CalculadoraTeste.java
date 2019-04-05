package classe;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora Calc = new Calculadora();
		
		System.out.println(Calc.somar(5.5, 4.5));
		
		Calc.acrescentar(10.5);
		
		System.out.println(Calc.obterResultado());
		
		Calc.limpar();
		
		System.out.println(Calc.obterResultado());
	}
}
