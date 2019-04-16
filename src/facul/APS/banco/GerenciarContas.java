package facul.APS.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarContas {

	public static List<Conta> lista = new ArrayList<Conta>();

	public static void adicionarConta(Conta conta) {
		lista.add(conta);
	}

	public static boolean removerConta(int numDaConta) {

		for (Conta c : lista) {
			if (c.getNumDaConta() == numDaConta) {
				lista.remove(c);
				return true;
			}
		}
		return false;

	}

	public static String buscarContasEspeciais() {

		for (Conta c : lista) {
			if (c instanceof ContaEspecial) {
				System.out.println(((ContaEspecial) c).toString());
			}
		}
		return "";
	}

	public static String buscarClientesUsandoLimite() {

		for (Conta c : lista) {
			if (c instanceof ContaCorrente && ((ContaCorrente) c).usandoLimite()) {
				System.out.println(((ContaCorrente) c).toString());
			}
		}
		return "";
	}

	public static Conta buscarConta(int numeroConta) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta) {
				return c;
			}
		}
		return null;

	}

	public static boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroContaFonte) {
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

	public static boolean sacar(int numeroConta, double valorSacado) {
		for (Conta c : lista) {
			/*
			 * if (c.getNumDaConta() == numeroConta && c instanceof
			 * ContaCorrente){ return ((ContaCorrente)c).sacar(valorSacado); }
			 * else
			 */ if (c.getNumDaConta() == numeroConta) {
				return c.sacar(valorSacado);
			}

		}
		return false;
	}

	public static boolean depositar(int numeroConta, double valorDepositado) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta) {
				return c.depositar(valorDepositado);
			}
		}
		return false;
	}

	public static String listarContas() {
		for (Conta c : lista) {
			System.out.println(c.toString());
			System.out.println("---------------------------");
		}
		return "";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------BEM VINDO AO BANCO APS FINANCES----------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Digite o número correspondente a opção desejada: ");
		System.out.println("1 - ");

		sc.close();

	}
}
