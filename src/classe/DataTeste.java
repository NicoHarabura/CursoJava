package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Data nascimento = new Data();
		
		System.out.println("dia: ");
		nascimento.dia = scanner.nextInt();
		System.out.println("mes: ");
		nascimento.mes = scanner.nextInt();
		System.out.println("ano: ");
		nascimento.ano = scanner.nextInt();
		
		System.out.println(nascimento.formatar());
		
		scanner.close();
	}
}
