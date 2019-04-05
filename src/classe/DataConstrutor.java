package classe;

public class DataConstrutor {

	int dia;
	int mes;
	int ano;
	
	public DataConstrutor() {
		this(25, 3, 1992);
	}
	
	DataConstrutor(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatar(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
