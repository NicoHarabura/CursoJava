package facul.Basico;

public class Exemplo4MetodoSomarReturnInt {
	
	static int somar (int num1, int num2){
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	public static void main(String[] args) {
		int retornoResultado;
		retornoResultado = somar(20, 20);
		System.out.println("A soma é: " + retornoResultado);
	}

}
