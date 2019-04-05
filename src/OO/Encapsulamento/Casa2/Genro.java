package OO.Encapsulamento.Casa2;

//import OO.Encapsulamento.Casa1.Sogra;
import OO.Encapsulamento.Casa1.Sogro;

public class Genro {
	
	private String segredo = "Minha sogra fala demais!";

	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Ninguém sabe mas eu acho que..." + euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println("Só meu amor sabe sobre a minha..." + meuAmor.segredoDoCasal);
		
		Sogro sograo = new Sogro();
		System.out.println("Sograo gosta de cerveja? " + sograo.gostaDeCerveja);
		
		//Sogra chata = new Sogra();
		//System.out.println(chata.segredoDeFamilia);
	}
}
