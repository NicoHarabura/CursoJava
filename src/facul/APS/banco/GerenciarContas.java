package facul.APS.banco;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class GerenciarContas {

	public static List<Conta> lista = new ArrayList<Conta>();

	public void adicionarConta(Conta conta) {
		lista.add(conta);
	}

	public boolean removerConta(int numDaConta) {

		for (Conta c : lista) {
			if (c.getNumDaConta() == numDaConta) {
				lista.remove(c);
				return true;
			}
		}
		return false;

	}

	public String buscarContasEspeciais() {

		for (Conta c : lista) {
			if (c instanceof ContaEspecial) {
				return ((ContaEspecial) c).toString();

			}
		}

		return "\nNenhuma conta especial foi encontrada.";
	}

	public String buscarClientesUsandoLimite() {

		for (Conta c : lista) {
			((ContaEspecial) c).usandoLimite();
			((ContaCorrente) c).usandoLimite();
			if (c instanceof ContaEspecial && ((ContaEspecial) c).usandoLimite()) {
				((ContaEspecial) c).toString();
			}
			if (c instanceof ContaCorrente && ((ContaCorrente) c).usandoLimite()) {
				((ContaCorrente) c).toString();
				return "";
			}
		}

		return "\nNenhum cliente está usando o limite.";
	}

	public Conta buscarConta(int numeroConta) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta) {
				return c;
			}
		}
		return null;

	}

	public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroContaFonte && c instanceof ContaCorrente) {
				((ContaCorrente) c).sacar(valor);
				for (Conta co : lista) {
					if (co.getNumDaConta() == numeroContaDestino) {
						return ((ContaCorrente) co).depositar(valor);
					}
				}
			} else if (c.getNumDaConta() == numeroContaFonte) {
				c.sacar(valor);
				for (Conta co : lista) {
					if (co.getNumDaConta() == numeroContaDestino) {
						return co.depositar(valor);
					}
				}
			}
		}
		return false;
	}

	public boolean sacar(int numeroConta, double valorSacado) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta && c instanceof ContaCorrente) {
				return ((ContaCorrente) c).sacar(valorSacado);
			} else if (c.getNumDaConta() == numeroConta) {
				return c.sacar(valorSacado);
			}

		}
		return false;
	}
	
	public boolean depositar(int numeroConta, double valorDepositado){
		for (Conta c : lista){
			if (c.getNumDaConta() == numeroConta){
				return c.depositar(valorDepositado);
			}
		}
		return false;
	}
	
	public String listarContas(){
		for (Conta c : lista){
			c.toString();
		}
		return "";
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		sc.close();

	}
}
