package OO.Heranca;

public class TesteDrive {
	
	public static void main(String[] args) {
		
		Carro c = new Civic();
		c.acelerar();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
		
		c = new Camaro();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
	}

}
