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
		boolean resultado = false;
		for (Conta c : lista) {
			if (c.getNumDaConta() == numDaConta) {
				lista.remove(c);
				System.out.println("CONTA REMOVIDA");
				return resultado = true;
			}
		}
		if (resultado == false) {
			System.out.println("CONTA NÃO ENCONTRADA");
			;
		}
		return resultado;

	}

	public static String buscarContasEspeciais() {
		for (Conta c : lista) {
			if (c instanceof ContaEspecial) {
				System.out.println(c.toString());
			}
		}
		return "";
	}

	public static String buscarClientesUsandoLimite() {
		for (Conta c : lista) {
			if (c instanceof ContaCorrente && ((ContaCorrente) c).usandoLimite()) {
				System.out.println(c.toString());
			}
		}
		return "";
	}

	public static Conta buscarConta(int numeroConta) {
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta) {
				System.out.println("CONTA LOCALIZADA");
				return c;
			}
		}
		System.out.println("CONTA NÃO LOCALIZADA");
		return null;

	}

	public static boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {
		boolean resultado = false;
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroContaFonte) {
				c.sacar(valor);
				for (Conta co : lista) {
					if (co.getNumDaConta() == numeroContaDestino) {
						System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO");
						return resultado = co.depositar(valor);
					}
				}
			}
		}
		System.out.println("TRANSFERENCIA NAO REALIZADA");
		return resultado;
	}

	public static boolean sacar(int numeroConta, double valorSacado) {
		boolean resultado = false;
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta) {
				System.out.println("SAQUE EFETUADO");
				return resultado = c.sacar(valorSacado);
			}

		}
		System.out.println("SAQUE NÃO EFETUADO");
		return resultado;
	}

	public static boolean depositar(int numeroConta, double valorDepositado) {
		boolean resultado = false;
		for (Conta c : lista) {
			if (c.getNumDaConta() == numeroConta) {
				System.out.println("DEPOSITO EFETUADO");
				return resultado = c.depositar(valorDepositado);
			}
		}
		System.out.println("SAQUE NÃO EFETUADO");
		return resultado;
	}

	public static void calcularRendimento (int numeroConta, double rendimento){
		for (Conta c : lista){
			if (c.getNumDaConta() == numeroConta && c instanceof ContaPoupanca){
				((ContaPoupanca) c).calculaRendimento(rendimento);
				System.out.println(c);
			}
		}
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
		int op = 11;
		while (op != 0) {
			// MENU PRINCIPAL
			System.out.println();
			System.out.println("Digite o número correspondente a opção desejada: ");
			System.out.println("1 - Adicionar nova conta");
			System.out.println("2 - Remover conta");
			System.out.println("3 - Realizar saque");
			System.out.println("4 - Realizar depósito");
			System.out.println("5 - Realizar transferencia");
			System.out.println("6 - Localizar conta");
			System.out.println("7 - Listar contas com limite em uso");
			System.out.println("8 - Listar contas com gerentes");
			System.out.println("9 - Calcular rendimento da poupança");
			System.out.println("10 - Mostrar todas as contas");
			System.out.println();
			System.out.println("Ou 0 - Para sair do sistema");
			op = sc.nextInt();
			while (op < 0 || op > 10) {
				System.out.println();
				System.out.println("-------------------OPÇÃO INVÁLIDA-------------------------");
				System.out.println("Digite o número correspondente a opção desejada: ");
				System.out.println("1 - Adicionar nova conta");
				System.out.println("2 - Remover conta");
				System.out.println("3 - Realizar saque");
				System.out.println("4 - Realizar depósito");
				System.out.println("5 - Realizar transferencia");
				System.out.println("6 - Localizar conta");
				System.out.println("7 - Listar contas com limite em uso");
				System.out.println("8 - Listar contas com gerentes");
				System.out.println("9 - Calcular rendimento da poupança");
				System.out.println("10 - Mostrar todas as contas");
				System.out.println();
				System.out.println("Ou 0 - Para sair do sistema");
				op = sc.nextInt();
			}

			// MENU LISTAR AS CONTAS
			if (op == 10) {
				System.out.println(lista.size());
				listarContas();
				op = 11;
			}
			
			//MENU CALCULAR RENDIMENTO
			if (op == 9){
				System.out.println("Digite o numero da conta poupança: ");
				int numeroConta = sc.nextInt(); 
				System.out.println("Digite o rendimento:");
				double rendimento = sc.nextDouble();
				calcularRendimento(numeroConta, rendimento);
			}

			// MENU BUSCAR CONTAS ESPECIAS
			if (op == 8){
				buscarContasEspeciais();
				op = 11;
			}
			
			// MENU BUSCAR CONTAS USANDO O LIMITE
			if (op == 7) {
				System.out.println(buscarClientesUsandoLimite());
				op = 11;
			}

			// MENU BUSCAR CONTA
			if (op == 6) {
				System.out.println("Digite o número da conta:");
				int numeroConta = sc.nextInt();
				System.out.println(buscarConta(numeroConta));
				op = 11;
			}

			// MENU TRANSFERIR
			if (op == 5) {
				System.out.println("Digite o número da conta fonte: ");
				int numeroContaFonte = sc.nextInt();
				System.out.println("Digite o número da conta destino: ");
				int numeroContaDestino = sc.nextInt();
				System.out.println("Digite o valor que deve ser transferido: ");
				double valor = sc.nextDouble();
				transferirValor(numeroContaFonte, numeroContaDestino, valor);
				op = 11;
			}

			// MENU DEPOSITAR
			if (op == 4) {
				System.out.println("Digite o número da conta:");
				int numeroConta = sc.nextInt();
				System.out.println("Digite o valor do deposito:");
				double valorDepositado = sc.nextDouble();
				depositar(numeroConta, valorDepositado);
				op = 11;
			}

			// MENU REMOVER CONTAS
			if (op == 2) {
				System.out.println("Digite o numero da conta que será removida: ");
				System.out.println();
				System.out.println("Ou 0 para voltar");
				int numDaConta = sc.nextInt();
				if (numDaConta != 0) {
					removerConta(numDaConta);

					op = 11;
				}
				if (numDaConta == 0) {
					op = 11;
				}
			}

			// MENU SACAR
			if (op == 3) {
				System.out.println("Digite o numero da conta: ");
				int numeroConta = sc.nextInt();
				System.out.println("Digite o valor do saque: ");
				double valorSacado = sc.nextDouble();
				sacar(numeroConta, valorSacado);
				op = 11;
			}

			// MENU CRIAÇÃO DE CONTAS
			while (op == 1) {
				System.out.println();
				System.out.println("Digite o número correspondente ao tipo de conta que será adicionada:");
				System.out.println("1 - Conta Padrão");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Poupança");
				System.out.println("4 - Conta Especial");
				System.out.println();
				System.out.println("Ou 0 - Para voltar");
				op = sc.nextInt();
				while (op < 0 || op > 4) {
					System.out.println();
					System.out.println("-------------------OPÇÃO INVÁLIDA-------------------------");
					System.out.println("Digite o número correspondente ao tipo de conta que será adicionada:");
					System.out.println("1 - Conta Padrão");
					System.out.println("2 - Conta Corrente");
					System.out.println("3 - Conta Poupança");
					System.out.println("4 - Conta Especial");
					System.out.println();
					System.out.println("Ou 0 - Para voltar");
					op = sc.nextInt();
				}
				// MENU DA CONTA PADRÃO
				if (op == 1) {
					System.out.println("DIGITE OS DADOS DA CONTA---");
					System.out.println();
					System.out.println("Número:");
					int numDaConta = sc.nextInt();
					System.out.println("Nome do cliente:");
					sc.nextLine();
					String nomeDoCliente = sc.nextLine();
					System.out.println("CPF:");
					long cpf = sc.nextLong();
					System.out.println("Saldo inicial da conta: ");
					double saldo = sc.nextDouble();
					adicionarConta(new Conta(numDaConta, nomeDoCliente, cpf, saldo));
					listarContas();
					System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
					char sn = sc.next().charAt(0);
					while (sn != 's' && sn != 'n') {
						System.out.println();
						System.out.println("-------------------OPÇÃO INVÁLIDA-------------------------");
						System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
						sn = sc.next().charAt(0);
					}
					if (sn == 's') {
						op = 1;
					} else {
						op = 0;
					}
				}
				// MENU CONTA CORRENTE
				if (op == 2) {
					System.out.println("DIGITE OS DADOS DA CONTA---");
					System.out.println();
					System.out.println("Número:");
					int numDaConta = sc.nextInt();
					System.out.println("Nome do cliente:");
					sc.nextLine();
					String nomeDoCliente = sc.nextLine();
					System.out.println("CPF:");
					long cpf = sc.nextLong();
					System.out.println("Saldo inicial da conta: ");
					double saldo = sc.nextDouble();
					System.out.println("Limite:");
					double limite = sc.nextDouble();
					adicionarConta(new ContaCorrente(numDaConta, nomeDoCliente, cpf, saldo, limite));
					System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
					char sn = sc.next().charAt(0);
					while (sn != 's' && sn != 'n') {
						System.out.println();
						System.out.println("-------------------OPÇÃO INVÁLIDA-------------------------");
						System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
						sn = sc.next().charAt(0);
					}
					if (sn == 's') {
						op = 1;
					} else {
						op = 0;
					}
				}
				// MENU DA CONTA POUPANÇA
				if (op == 3) {
					System.out.println("DIGITE OS DADOS DA CONTA---");
					System.out.println();
					System.out.println("Número:");
					int numDaConta = sc.nextInt();
					System.out.println("Nome do cliente:");
					sc.nextLine();
					String nomeDoCliente = sc.nextLine();
					System.out.println("CPF:");
					long cpf = sc.nextLong();
					System.out.println("Saldo inicial da conta: ");
					double saldo = sc.nextDouble();
					adicionarConta(new ContaPoupanca(numDaConta, nomeDoCliente, cpf, saldo));
					System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
					char sn = sc.next().charAt(0);
					while (sn != 's' && sn != 'n') {
						System.out.println();
						System.out.println("-------------------OPÇÃO INVÁLIDA-------------------------");
						System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
						sn = sc.next().charAt(0);
					}
					if (sn == 's') {
						op = 1;
					} else {
						op = 0;
					}
				}
				// MENU DA CONTA ESPECIAL
				if (op == 4) {
					System.out.println("DIGITE OS DADOS DA CONTA---");
					System.out.println();
					System.out.println("Número:");
					int numDaConta = sc.nextInt();
					System.out.println("Nome do cliente:");
					sc.nextLine();
					String nomeDoCliente = sc.nextLine();
					System.out.println("CPF:");
					long cpf = sc.nextLong();
					System.out.println("Saldo inicial da conta: ");
					double saldo = sc.nextDouble();
					System.out.println("Limite:");
					double limite = sc.nextDouble();
					System.out.println("Nome do gerente: ");
					String nomeDoGerente = sc.next();
					adicionarConta(new ContaEspecial(numDaConta, nomeDoCliente, cpf, saldo, limite, nomeDoGerente));
					System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
					char sn = sc.next().charAt(0);
					while (sn != 's' && sn != 'n') {
						System.out.println();
						System.out.println("-------------------OPÇÃO INVÁLIDA-------------------------");
						System.out.println("Gostaria de criar mais uma nova conta?\ns/n?");
						sn = sc.next().charAt(0);
					}
					if (sn == 's') {
						op = 1;
					} else {
						op = 0;
					}
				}
				if (op == 0) {
					op = 11;
				}
			}

		}
		System.out.println("------------OBRIGADO POR USAR O BANCO APS FINANCES-------------");

		sc.close();

	}
}
