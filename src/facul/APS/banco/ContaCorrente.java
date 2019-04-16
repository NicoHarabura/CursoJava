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
		double novoSaldo = saldo;
		
		if (saldo < valorSacado && saldo > 0){
			aux = 0 - novoSaldo;
			novoSaldo -= valorSacado;
			valorSacado += aux;
			if (limite >= valorSacado){
				limite -= valorSacado;
				saldo = novoSaldo;
				return true;
			}
		} else if (saldo < valorSacado && saldo <= 0){
			novoSaldo -= valorSacado;
			if (limite >= valorSacado){
				limite -= valorSacado;
				saldo = novoSaldo;
				return true;
			}
		} else if (saldo > 0 && saldo > valorSacado){
			saldo -= valorSacado;
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
