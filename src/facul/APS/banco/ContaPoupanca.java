package facul.APS.banco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(){
		super();
	}
	
	public ContaPoupanca(int numDaConta, String nomeDoCliente, long cpf, double saldo) {
		super(numDaConta, nomeDoCliente, cpf, saldo);
	}
	
	public void calculaRendimento(double porcentagemRendimento){
		saldo += saldo * porcentagemRendimento;
	}
	
	@Override
	public String toString (){
		return super.toString();
	}

}
