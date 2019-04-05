package OO.Polimorfismo;

public class Pessoa {

	private double peso = 0;
	
	public Pessoa (double pesoInicial){
		this.peso = pesoInicial;
	}
	public double getPeso(){
		return peso;
	}
	
	public void Comer(Comida... comidas){
		for (Comida c: comidas){
		this.peso += c.getPeso();
		}
	}
	
	public void Beber(Bebida... bebidas){
		for(Bebida b: bebidas){
		this.peso += b.getPeso();
		}
	}
}
