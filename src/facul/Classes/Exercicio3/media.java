package facul.Classes.Exercicio3;

public class media {
	double n1;
	double n2;
	double n3;
	final int meta = 6;
	
	void receberNotas (double n1, double n2, double n3){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	double calcularMedia (){
		return (n1 + n2 + n3)/3;
	}
	
	void aprovarOuReprovar (){
		System.out.println("Sua media � " + calcularMedia());
		if (calcularMedia()<meta){
			System.out.println("Parab�ns! Voc� foi reprovado, boa sorte na DP!");
		} else {
			System.out.println("Bom... n�o foi dessa vez. Voc� foi aprovado ");
		}
	}

}
