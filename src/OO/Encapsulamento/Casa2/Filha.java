package OO.Encapsulamento.Casa2;

import OO.Encapsulamento.Casa1.Sogra;
import OO.Encapsulamento.Casa1.Sogro;

public class Filha extends Sogra{

	String segredoDoCasal = "demiss�o";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Ninguem sabe sobre a..." + euMesma.segredoDoCasal);
		
		//Sogra mamae = new Sogra();
		//System.out.println("Meu amor n�o sabe ..." + mamae.segredoDeFamilia);
		
		System.out.println("Meu amor n�o sabe..." + euMesma.segredoDeFamilia);
		
		Sogro papai = new Sogro();
		System.out.println("Meu pai gosta de cerveja? " + papai.gostaDeCerveja);
	}
}
