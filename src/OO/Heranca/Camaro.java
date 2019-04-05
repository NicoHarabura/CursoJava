package OO.Heranca;

public class Camaro extends Carro {
	
	public Camaro(){
		VELOCIDADE_MAXIMA = 350;
	}
	
	public void acelerar (){
		super.acelerarMais(20);
	}

}
