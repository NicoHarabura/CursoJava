package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario fun1 = new Funcionario();
		fun1.nome = "Jo�o";
		fun1.salario = 4000;
		fun1.funcao = "Programador";
		System.out.println("O nome dele � " + fun1.nome + "," + fun1.formatar() + "e ele � " + fun1.funcao);
		
		Funcionario fun2 = new Funcionario("Pedro", 5000, "Gerente");
		System.out.println("O nome dele � " + fun2.nome + "," + fun2.formatar() + "e ele � " + fun2.funcao);
	}
}
