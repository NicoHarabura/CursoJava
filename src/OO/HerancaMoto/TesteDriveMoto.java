package OO.HerancaMoto;

public class TesteDriveMoto {
	
	public static void main(String[] args) {
		Moto m = new CG();
		m.acelerar();
		System.out.println(m.getVelocidadeAtual());
		m.frear();
		System.out.println(m.getVelocidadeAtual());
		
		m = new Bis();
		m.acelerar();
		System.out.println(m.getVelocidadeAtual());

		m = new R1();
		m.acelerar();
		System.out.println(m.getVelocidadeAtual());
		
	}

}
