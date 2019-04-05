package facul.Basico;

public class Exemplo5ModificarValor {
	
	static int modificar (int a){
		a = 200;
		return a;
	}
	
	public static void main(String[] args) {
		int a = 50;
		modificar(a);
		System.out.println("(main) valor de a: " + a);
		
		System.out.println("(metodo) valor de a: " + modificar(a));
	}

}
