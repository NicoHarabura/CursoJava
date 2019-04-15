package facul.APS.banco;

public class Conta {

	int numDaConta;
	String nomeDoCliente;
	long cpf;
	double saldo;

	public Conta() {

	}

	public Conta(int numDaConta, String nomeDoCliente, long cpf, double saldo) {
		this.numDaConta = numDaConta;
		this.nomeDoCliente = nomeDoCliente;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public int getNumDaConta() {
		return numDaConta;

	}

	protected void setNumDaConta(int numDaConta) {
		this.numDaConta = numDaConta;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;

	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public long getCpf() {
		return cpf;

	}

	protected void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
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

		return "\nNome do Cliente: " 
		+ nomeDoCliente 
		+ "\nNúmero da conta: " 
		+ numDaConta 
		+ "\nCPF: " 
		+ cpf 
		+ "\nSaldo: "
		+ saldo;
	}

}
