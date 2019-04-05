package facul.APS.banco;

public class Conta {

	int numDaConta;
	String nomeDoCliente;
	long cpf;
	double saldo;

	protected Conta(int numDaConta, String nomeDoCliente, long cpf, double saldo) {
		this.numDaConta = numDaConta;
		this.nomeDoCliente = nomeDoCliente;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	
	int getNumDaConta() {
		return numDaConta;

	}

	String getNomeDoCliente() {
		return nomeDoCliente;

	}

	void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	long getCpf() {
		return cpf;

	}

	double getSaldo() {
		return saldo;
	}

	public boolean sacar(double valorSacado) {
		saldo -= valorSacado;

		return true;
	}

	public boolean depositar(double valorDepositado) {
		saldo += valorDepositado;

		return true;
	}

	public String toString() {

		return "Nome do Cliente: " + nomeDoCliente 
				+"\nNúmero da conta: "+ numDaConta 
				+"\nCPF: "+ cpf 
				+"\nSaldo: "+ saldo; 
	}

}
