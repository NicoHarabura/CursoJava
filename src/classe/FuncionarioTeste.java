package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario fun1 = new Funcionario();
		fun1.nome = "João";
		fun1.salario = 4000;
		fun1.funcao = "Programador";
		System.out.println("O nome dele é " + fun1.nome + "," + fun1.formatar() + "e ele é " + fun1.funcao);
		
		Funcionario fun2 = new Funcionario("Pedro", 5000, "Gerente");
		System.out.println("O nome dele é " + fun2.nome + "," + fun2.formatar() + "e ele é " + fun2.funcao);
	}
}
