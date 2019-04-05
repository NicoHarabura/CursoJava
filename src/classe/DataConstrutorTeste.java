package classe;

public class DataConstrutorTeste {

	public static void main(String[] args) {
		
		DataConstrutor nascimento = new DataConstrutor();
		//nascimento.dia = 24;
		//nascimento.mes = 9;
		//nascimento.ano = 1993;
		
		System.out.println(nascimento.formatar());
		
		DataConstrutor casamento = new DataConstrutor(25, 3, 1992);
		System.out.println(casamento.formatar());
	}
}
