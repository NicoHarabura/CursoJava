package facul.APS.banco;

import java.util.ArrayList;
import java.util.List;

//public String buscarContasEspeciais() – busca todas as contas especiais,
//guardando os dados dessas contas em uma String e então retornando o resultado da busca; 
//• public String buscarClientesUsandoLimite() – busca todos os clientes de conta corrente
//ue estejam utilizando o limite,
//guardando os dados dessas contas em uma String e então retornando o resultado da busca; 
//• public Conta buscarConta(int numeroConta) – busca uma conta pelo seu número, e a retorna se encontrar.
//Caso a conta não exista, deve retornar null; • public boolean transferirValor
//(int numeroContaFonte, int numeroContaDestino, double valor) 
//• public boolean sacar(int numeroConta, double valorSacado) – 
//deve buscar a conta indicada pelo número e então sacar o valor especificado, 
//usando o método de sacar da conta. Se a conta não for encontrada, ou o valor não puder ser sacado, retorna false; 
//• public boolean depositar(int numeroConta, double valorDepositado) 
//– deve buscar a conta indicada e realizar o depósito. Caso não encontre o número da conta,
//ou o depósito falhe, retornar false; 
//• public String listarContas() – retorna uma String com os dados de todas as contas;  
//Método main: menu com acesso a todas as opções. No adicionar, 
//lembrar que é possível criar uma conta de qualquer um dos três tipos 
//– então você deve perguntar ao usuário qual ele quer; 

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
	
	public String buscarContasEspeciais(){
		
		for (Conta c : lista){
			if (c instanceof ContaEspecial){
				((ContaEspecial) c).toStringEspecial();
				
				
			}
		}
		
		return "";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		sc.close();

	}
}
