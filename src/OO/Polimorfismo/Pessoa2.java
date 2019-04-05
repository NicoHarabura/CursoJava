package OO.Polimorfismo;

public class Pessoa2 {

	private double peso = 0;
	
	public Pessoa2(double pesoAtual){
		this.peso = pesoAtual;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void beber(Bebida bebida){
		this.peso += bebida.getPeso();
	}
}
