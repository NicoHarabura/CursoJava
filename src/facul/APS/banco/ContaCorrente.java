package facul.APS.banco;

public class ContaCorrente extends Conta{
	
	double limite;

		
	public ContaCorrente(int numDaConta, String nomeDoCliente, long cpf, double saldo, int limite) {
		super(numDaConta, nomeDoCliente, cpf, saldo);
		this.limite = limite;
	}

	public ContaCorrente(int numDaConta, String nomeDoCliente, long cpf, double saldo) {
		super(numDaConta, nomeDoCliente, cpf, saldo);
	}

	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double valorSacado) {
				
		if(saldo <= 0){
			
			limite -= valorSacado;
		} else {
			saldo -= valorSacado;
		}

		return true;
	}
	
	public boolean usandoLimite(){
		if (saldo<0){
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public String toString() {

		return "Nome do Cliente: " + nomeDoCliente 
				+"\nNúmero da conta: "+ numDaConta 
				+"\nCPF: "+ cpf 
				+"\nSaldo: "+ saldo
				+"\nLimite: "+ limite; 
	}
	

	
	
	

}
