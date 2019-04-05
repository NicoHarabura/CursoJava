package facul.Basico;

public class Exemplo3MetodoSomarInt {
	
	static void somar (int num1, int num2){
		int soma;
		soma = num1 + num2;
		System.out.println("A soma é: " + soma);
	}
	
	public static void main(String[] args) {
		somar(20, 42);
	}

}
