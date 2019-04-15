package facul.APS.banco;

public class ContaEspecial extends ContaCorrente{

	String nomeDoGerente;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(int numDaConta, String nomeDoCliente, long cpf, double saldo, double limite,
			String nomeDoGerente) {
		super(numDaConta, nomeDoCliente, cpf, saldo, limite);
		this.nomeDoGerente = nomeDoGerente;
	}

	public ContaEspecial(int numDaConta, String nomeDoCliente, long cpf, double saldo, String nomeDoGerente) {
		super(numDaConta, nomeDoCliente, cpf, saldo);
		this.nomeDoGerente = nomeDoGerente;
	}

	public String getNomeDoGerente() {
		return nomeDoGerente;
	}

	public void setNomeDoGerente(String nomeDoGerente) {
		this.nomeDoGerente = nomeDoGerente;
	}
	
	public String toStringEspecial (){
		return super.toString() + "\nNome do gerente:" + nomeDoGerente;
	}
	
}
