package OO.HerancaMoto;

public class Moto {

	protected int VELOCIDADE_MAXIMA = 300;
	private int velocidadeAtual = 0;
	
	protected final void acelerarMais(int velocidade){
		if (velocidadeAtual + velocidade > 200){
			velocidadeAtual = 300;
		} else {
			velocidadeAtual += velocidade;
		}
	}
	protected final void frearMais (int velocidade){
		if (velocidadeAtual + velocidade < 0){
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= velocidade;
		}
	}
	
	protected void acelerar(){
		acelerarMais(10);
	}
	
	protected void frear(){
		frearMais(10);
	}
	
	protected int getVelocidadeAtual(){
		return velocidadeAtual;
	}
	
}
