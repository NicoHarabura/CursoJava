package facul.APS.banco;

public class ContaCorrente extends Conta {

	double limite;

	public ContaCorrente(int numDaConta, String nomeDoCliente, long cpf, double saldo, double limite) {
		super(numDaConta, nomeDoCliente, cpf, saldo);
		this.limite = limite;
	}

	public ContaCorrente(int numDaConta, String nomeDoCliente, long cpf, double saldo) {
		super(numDaConta, nomeDoCliente, cpf, saldo);
	}

	public ContaCorrente() {
		super();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valorSacado) {

		double aux = 0;
		saldo -= valorSacado;
		if (saldo <= 0 && valorSacado < limite) {
			aux = saldo;
			limite += aux;
			return true;
		}

		return false;
	}

	@Override
	public boolean depositar(double valorDepositado) {
		return super.depositar(valorDepositado);
	}

	public boolean usandoLimite() {
		if (saldo < 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return super.toString() + "\nLimite: " + limite;
	}

}
