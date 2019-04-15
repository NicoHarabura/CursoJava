package facul.APS.banco;

import java.util.ArrayList;
import java.util.List;

//public String buscarContasEspeciais() � busca todas as contas especiais,
//guardando os dados dessas contas em uma String e ent�o retornando o resultado da busca; 
//� public String buscarClientesUsandoLimite() � busca todos os clientes de conta corrente
//ue estejam utilizando o limite,
//guardando os dados dessas contas em uma String e ent�o retornando o resultado da busca; 
//� public Conta buscarConta(int numeroConta) � busca uma conta pelo seu n�mero, e a retorna se encontrar.
//Caso a conta n�o exista, deve retornar null; � public boolean transferirValor
//(int numeroContaFonte, int numeroContaDestino, double valor) 
//� public boolean sacar(int numeroConta, double valorSacado) � 
//deve buscar a conta indicada pelo n�mero e ent�o sacar o valor especificado, 
//usando o m�todo de sacar da conta. Se a conta n�o for encontrada, ou o valor n�o puder ser sacado, retorna false; 
//� public boolean depositar(int numeroConta, double valorDepositado) 
//� deve buscar a conta indicada e realizar o dep�sito. Caso n�o encontre o n�mero da conta,
//ou o dep�sito falhe, retornar false; 
//� public String listarContas() � retorna uma String com os dados de todas as contas;  
//M�todo main: menu com acesso a todas as op��es. No adicionar, 
//lembrar que � poss�vel criar uma conta de qualquer um dos tr�s tipos 
//� ent�o voc� deve perguntar ao usu�rio qual ele quer; 

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
