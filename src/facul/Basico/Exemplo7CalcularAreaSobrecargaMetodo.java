package facul.Basico;

public class Exemplo7CalcularAreaSobrecargaMetodo {
	
	static int calcularArea (int x, int y){
		return x * y;
	}
	//static int calcularArea (int y, int x){
		//return y * x;
	//}
	static int calcularArea (int x){
		return x * x;
	}
	static int calcularArea (int x, int y, int z){
		return x * y * z;	
	}
	
	public static void main(String[] args) {
		System.out.println(calcularArea(2));
		System.out.println(calcularArea(2, 2));
		System.out.println(calcularArea(2, 2, 2));
	}

}
