package facul.Classes.Exemplo1;

public class carro {
	
	String cor;
	String marca;
	String modelo;
	int ano;
	double potencia;
	double preco;
	double kmPorLitro;
	boolean transmissao;
	int lugares;
	double tanque;
	
	static void abastecer (carro car, double litros){
		car.tanque += litros;
	}
	
static void andarCarro (carro car, int km){
		car.tanque -= km/car.kmPorLitro;
	}
	
	static void get (carro car){
		//System.out.println(car.cor+car.marca+car.modelo+car.ano+car.potencia+car.preco+car.kmPorLitro+car.transmissao+car.lugares);
		if (car.tanque <= 0){
		System.out.println("No fuel" + car.tanque);
		} else {
		System.out.println(car.tanque);	
		}
	}

	static void set (carro car, String cor, String marca, String modelo, int ano,	double potencia, double preco, double kmPorLitro, boolean transmissao, int lugares){
		car.cor = cor;
		car.marca = marca;
		car.modelo = modelo;
		car.ano = ano;
		car.potencia = potencia;
		car.preco = preco;
		car.kmPorLitro = kmPorLitro;
		car.transmissao =  transmissao;
		car.lugares = lugares;
		car.tanque = 0;
		
	}
	
	public static void main(String[] args) {
		
		carro fusca = new carro ();
		set(fusca, "", "", "", 1, 1.00, 1.00, 1.00, true, 5);
		System.out.println(fusca);
		get(fusca);
		abastecer(fusca, 20.00);
		get (fusca);
		andarCarro(fusca, 20);
		get(fusca);
		
	}
	
}
