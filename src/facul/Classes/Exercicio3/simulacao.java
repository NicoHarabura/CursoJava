package facul.Classes.Exercicio3;

public class simulacao {

	public static void main(String[] args) {
		media mediaAluno = new media();
		
		mediaAluno.receberNotas(5.2, 10.0, 2.0);
		mediaAluno.calcularMedia();
		mediaAluno.aprovarOuReprovar();
		
	}
}
